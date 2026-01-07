package com.stringfileandsearch;

public class StringBuilderExample {
    public static void main(String[] args) {
        //  initialize StringBuilder
        StringBuilder sb = new StringBuilder("Hello");
        
        // append strings
        sb.append(" World");
        sb.append("!");
        System.out.println(sb); 
        
        sb.insert(6, "Java ");
        System.out.println(sb); 
        
        // delete a portion
        sb.delete(6, 11);
        System.out.println(sb); 
        
        // reverse the string
        sb.reverse();
        System.out.println(sb);
        
    }
}