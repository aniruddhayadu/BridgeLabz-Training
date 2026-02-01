package com.csv.advances.encryptdecrypt;


import java.io.BufferedReader;
import java.io.FileReader;

public class DecryptCSVData {

    public static void main(String[] args) {

        String key = "1234567890123456"; // same key
        String csvFile = "encrypted_students.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            String header = br.readLine(); // skip header
            System.out.println(header);

            String line;
            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                String id = data[0];
                String name = data[1];
                String email = AESEncryptionUtil.decrypt(data[2], key);
                String salary = AESEncryptionUtil.decrypt(data[3], key);

                System.out.println(id + "," + name + "," + email + "," + salary);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
