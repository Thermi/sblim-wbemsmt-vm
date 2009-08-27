 /** 
  * ElementNameMaxLengthValidator.java
  *
  * © Copyright IBM Corp.  2009,2005
  *
  * THIS FILE IS PROVIDED UNDER THE TERMS OF THE ECLIPSE PUBLIC LICENSE
  * ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS FILE
  * CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT.
  *
  * You can obtain a current copy of the Eclipse Public License from
  * http://www.opensource.org/licenses/eclipse-1.0.php
  *
  * @author: Michael Bauschert <Michael.Bauschert@de.ibm.com>
  *
  * Contributors: 
  * 
  * Description: Checks if the max length limit was exceeded 
  * 
  */
package org.sblim.wbemsmt.vm.validator;

import org.sblim.wbemsmt.bl.messages.Message;
import org.sblim.wbemsmt.bl.messages.MessageList;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf;
import org.sblim.wbemsmt.tools.validator.Validator;
import org.sblim.wbemsmt.vm.VMErrCodes;
import org.sblim.wbemsmt.vm.bl.adapter.VMCimAdapter;

public class ElementNameMaxLengthValidator extends Validator {

	
	private final VMCimAdapter mcAdapter;
	private final LabeledBaseInputComponentIf elementNameField;

	/**
	 * Creates a new ElementNameMaxLengthValidator
	 * @param adapter
	 * @param elementNameField the input field for the Element name
	 */
	public ElementNameMaxLengthValidator(VMCimAdapter adapter, LabeledBaseInputComponentIf elementNameField) {
		super(adapter);
		mcAdapter = adapter;
		this.elementNameField = elementNameField;
	}

	/**
	 * @see org.sblim.wbemsmt.tools.validator.Validator#validate()
	 */
	public void validateElement(MessageList result) throws WbemsmtException {
		
		Integer length = mcAdapter.getSelectedVM().getElementNameMaxLength();
        if (length != null)
        {
        	int lengthFound = ("" + elementNameField.getConvertedControlValue()).length();
        	int maxLength = length.intValue();
        	if (lengthFound > maxLength)
        	{
        		result.addMessage(Message.create(VMErrCodes.MSGDEF_ELEMENT_NAME_MAX_LENGTH_EXCEEDED, adapter.getBundle(), new Object[]{""+lengthFound,""+maxLength}));			
        	}
        }
        else
        {
        	result.addMessage(Message.create(VMErrCodes.MSGDEF_ELEMENT_NAME_MAX_LENGTH_CHECK_NOT_POSSIBLE, adapter.getBundle()));			
        }
			
	}

	protected LabeledBaseInputComponentIf[] getComponents() {
		return new LabeledBaseInputComponentIf[]{elementNameField} ;
	}

}
