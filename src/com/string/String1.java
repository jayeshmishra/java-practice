//reverse a string
package com.string;

public class String1 {

	public static void main(String[] args) {
		
		String s="jay";
		String rev="";
		
		for(int i=s.length()-1; i>=0; i--) {
			rev+=s.charAt(i);
		}
		
		System.out.println(rev);
	}
}