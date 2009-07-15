 /** 
  * Int2Hex.java
  *
  * © Copyright IBM Corp. 2008
  *
  * THIS FILE IS PROVIDED UNDER THE TERMS OF THE COMMON PUBLIC LICENSE
  * ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS FILE
  * CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT.
  *
  * You can obtain a current copy of the Common Public License from
  * http://www.opensource.org/licenses/cpl1.0.php
  *
  * @author: Michael Bauschert <Michael.Bauschert@de.ibm.com>
  *
  * Contributors: 
  * 
  * Description: Class to convert a integer into a hexadecimal string
  * 
  */
package org.sblim.wbemsmt.vm.util;

public class Int2Hex {
    /**
     * Array with hexa decimal characters
     */
    static final char[] HEX_ARR={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

    /**
     * Change a number into a hexadecimal character
     *
     * @param b number between 0 and 15
     *
     * @return hexadecimal character
     */
    public static char number2Hex(byte b) {
        char res='?';
        if(b>=0 && b<=15)
        {
            res=HEX_ARR[b];
        }
        return res;
    }

    /**
     * Change a number into a hexadecimal character
     *
     * @param num number to be converte
     *
     * @return hexadecimal string
     */
    public static String int2Hex(int num) {
        String res= num == 0 ? "0" : "";
        for(int i=0;num != 0;i++) {
            res=number2Hex((byte)(num&0x0f))+res;
            num>>>=4;
        }
        
        return res;
    }

    /**
     * Test output
     * @param args
     */
    public static void main(String[] args)
    {
        System.err.println(int2Hex(1));
        System.err.println(int2Hex(128));
        System.err.println(int2Hex(255));
        System.err.println(int2Hex(256));
    }
}
