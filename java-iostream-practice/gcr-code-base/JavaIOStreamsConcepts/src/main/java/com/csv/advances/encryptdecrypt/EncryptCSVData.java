package com.csv.advances.encryptdecrypt;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.List;

public class EncryptCSVData {

    public static void main(String[] args) {

        String key = "1234567890123456"; // 16 chars

        List<String[]> students = Arrays.asList(
                new String[]{"101", "Anni", "anni@gmail.com", "60000"},
                new String[]{"102", "Princi", "princi@gmail.com", "52000"},
                new String[]{"103", "Nikki", "nikki@gmail.com", "75000"}
        );

        String csvFile = "encrypted_students.csv";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(csvFile))) {

            bw.write("ID,Name,Email,Salary\n");

            for (String[] s : students) {
                String encryptedEmail = AESEncryptionUtil.encrypt(s[2], key);
                String encryptedSalary = AESEncryptionUtil.encrypt(s[3], key);

                bw.write(s[0] + "," + s[1] + "," + encryptedEmail + "," + encryptedSalary + "\n");
            }

            System.out.println("Encrypted CSV generated.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

