package com.corejava.strings;

/**
 * Demonstrates difference between == and equals() in String.
 */


public class StringEqualsVsDoubleEquals {

	public static void main(String[] args) {
        String s1 = new String("Java");
        String s2 = new String("Java");

        System.out.println(s1 == s2);        // false (reference)
        System.out.println(s1.equals(s2));   // true (content)
    }
}
