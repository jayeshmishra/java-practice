package com.corejava.strings;

/**
 * Demonstrates that String objects are immutable in Java.
 */

public class StringImmutability {

	 public static void main(String[] args) {
	        String s = "Java";
	        s.concat(" World");

	        // Original string remains unchanged
	        System.out.println("String value: " + s);
	    }
}
