package com.stringfileandsearch.stringbuilder;

import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        StringBuilder sb = new StringBuilder();
        HashSet<Character> seen = new HashSet<>();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (!seen.contains(ch)) {
                sb.append(ch);
                seen.add(ch);
            }
        }

        System.out.println("String without duplicates: " + sb.toString());

        sc.close();
    }
}

