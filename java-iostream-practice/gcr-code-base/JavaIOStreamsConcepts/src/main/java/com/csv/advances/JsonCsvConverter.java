package com.csv.advances;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.util.*;

public class JsonCsvConverter {

    public static void main(String[] args) {

        String jsonFile = "students.json";
        String csvFile = "students.csv";
        String outputJson = "students_from_csv.json";

        try {
            // JSON -> CSV
            List<Map<String, Object>> students = readJson(jsonFile);
            writeCsv(students, csvFile);
            System.out.println("JSON to CSV conversion done!");

            // CSV -> JSON
            List<Map<String, Object>> studentsFromCsv = readCsv(csvFile);
            writeJson(studentsFromCsv, outputJson);
            System.out.println("CSV to JSON conversion done!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Read JSON file
    private static List<Map<String, Object>> readJson(String jsonFile) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(new File(jsonFile),
                new TypeReference<List<Map<String, Object>>>() {});
    }

    // Write CSV file
    private static void writeCsv(List<Map<String, Object>> list, String csvFile) throws IOException {
        if (list.isEmpty()) return;

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(csvFile))) {

            // header
            Set<String> headers = list.get(0).keySet();
            bw.write(String.join(",", headers));
            bw.newLine();

            // rows
            for (Map<String, Object> row : list) {
                List<String> values = new ArrayList<>();
                for (String header : headers) {
                    values.add(String.valueOf(row.get(header)));
                }
                bw.write(String.join(",", values));
                bw.newLine();
            }
        }
    }

    // Read CSV file
    private static List<Map<String, Object>> readCsv(String csvFile) throws IOException {
        List<Map<String, Object>> list = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            String headerLine = br.readLine();
            String[] headers = headerLine.split(",");

            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                Map<String, Object> row = new LinkedHashMap<>();
                for (int i = 0; i < headers.length; i++) {
                    row.put(headers[i], values[i]);
                }
                list.add(row);
            }
        }

        return list;
    }

    // Write JSON file
    private static void writeJson(List<Map<String, Object>> list, String jsonFile) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.writerWithDefaultPrettyPrinter().writeValue(new File(jsonFile), list);
    }
}

