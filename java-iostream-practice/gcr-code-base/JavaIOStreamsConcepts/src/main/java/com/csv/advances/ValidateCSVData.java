package com.csv.advances;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.regex.Pattern;

public class ValidateCSVData {

    // Email regex
    private static final String EMAIL_REGEX =
            "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

    // Phone regex (exactly 10 digits)
    private static final String PHONE_REGEX =
            "^[0-9]{10}$";

    public static void main(String[] args) {

        Pattern emailPattern = Pattern.compile(EMAIL_REGEX);
        Pattern phonePattern = Pattern.compile(PHONE_REGEX);

        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(
                        ValidateCSVData.class
                                .getClassLoader()
                                .getResourceAsStream("data/csv/users.csv")))) {

            String line;
            boolean isHeader = true;

            System.out.println("Invalid CSV Rows");
            System.out.println("--------------------------------");

            while ((line = br.readLine()) != null) {

                if (isHeader) {
                    isHeader = false;
                    continue;
                }

                String[] data = line.split(",");

                // Safety check
                if (data.length < 4) {
                    System.out.println("Invalid row (missing columns): " + line);
                    continue;
                }

                String id = data[0];
                String name = data[1];
                String email = data[2];
                String phone = data[3];

                boolean valid = true;
                String errorMsg = "";

                if (!emailPattern.matcher(email).matches()) {
                    valid = false;
                    errorMsg += "Invalid Email ";
                }

                if (!phonePattern.matcher(phone).matches()) {
                    valid = false;
                    errorMsg += "Invalid Phone ";
                }

                if (!valid) {
                    System.out.println(
                            "Row Error [" + errorMsg.trim() + "] -> " + line
                    );
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
