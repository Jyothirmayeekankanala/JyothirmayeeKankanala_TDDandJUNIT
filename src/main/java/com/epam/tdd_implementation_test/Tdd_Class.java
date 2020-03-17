package com.epam.tdd_implementation_test;

/**
 * Hello world!
 *
 */
public class Tdd_Class 
{
    public String remove_A(String a )
    {
    	/*Remove ‘A’ if it is present in first 2 characters of the string.
		if ‘A’ is present after 2 characters, it should not be
		removed.Ex:“ABCD” => “BCD”
 		“AACD” => “CD”
 		“BACD” => “BCD”
 		“BBAA” => “BBAA”
 		“AABAA” => “BAA”*/
		String res="";
    	if(a.length()>=1 && a.charAt(0)!='A')
    		res=res+a.charAt(0)+"";
    	if(a.length()>=2 && a.charAt(1)!='A')
    		res=res+a.charAt(1);
    	if(a.length()>2)
    		res=res+a.substring(2,a.length());
    	return res;
    }
}
