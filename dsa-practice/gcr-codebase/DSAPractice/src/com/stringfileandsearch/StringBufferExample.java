package com.stringfileandsearch;

public class StringBufferExample {
    public static void main(String[] args) {
        // initialize StringBuffer
        StringBuffer sbf = new StringBuffer("Hello");
        
        // append strings 
        sbf.append(" World");
        sbf.append("!");
        System.out.println(sbf); 
        
        // insert at a specific position
        sbf.insert(6, "Java ");
        System.out.println(sbf); 
        
        // delete a portion
        sbf.delete(6, 11);
        System.out.println(sbf); 
        
        // 5. Reverse the string
        sbf.reverse();
        System.out.println(sbf);
 
    }
}