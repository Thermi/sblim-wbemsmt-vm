 /** 
  * MethodSupport.java
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
  * Description: Data object for supported Methods
  * 
  */
package org.sblim.wbemsmt.vm.bl.adapter;

import javax.cim.UnsignedInteger16;

public class MethodSupport {

	public final static MethodSupport NOT_SUPPORTED = new MethodSupport();
	public final static MethodSupport SYNCHRONOUS = new MethodSupport();
	public final static MethodSupport ASYNCHRONOUS = new MethodSupport();
	
	private MethodSupport()
	{}
	

	public static MethodSupport isMethodSupported(
			UnsignedInteger16[] synchronousMethodsSupported,
			UnsignedInteger16[] asynchronousMethodsSupported,
			UnsignedInteger16 supportedMethod) {

		for (int i = 0; asynchronousMethodsSupported != null && i < asynchronousMethodsSupported.length; i++) {
			UnsignedInteger16 value = asynchronousMethodsSupported[i];
			if (value.intValue() == supportedMethod.intValue() )
			{
				return ASYNCHRONOUS;
			}
		}
		
		for (int i = 0; synchronousMethodsSupported != null && i < synchronousMethodsSupported.length; i++) {
			UnsignedInteger16 value = synchronousMethodsSupported[i];
			if (value.intValue() == supportedMethod.intValue() )
			{
				return SYNCHRONOUS;
			}
		}
		
		return NOT_SUPPORTED;
	}


	public boolean isSupported() {
		return this == SYNCHRONOUS || this == ASYNCHRONOUS;
	}
	
}
