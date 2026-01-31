package com.coderepocleaner;

import java.io.File;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.*;

// Main application
public class CodeRepoCleanerApp {

    public static void main(String[] args) throws Exception {

        // Root directory to scan
        String rootDir = "D:/LeetCode";

        // Scan Java files
        List<Path> javaFiles =
                JavaFileScanner.scanJavaFiles(rootDir);

        System.out.println("Total Java files found: " + javaFiles.size());

        // Organize files
        Map<FileType, List<File>> categorized =
                FileOrganizer.organize(javaFiles);

        // Display summary
        categorized.forEach((k, v) ->
                System.out.println(k + " : " + v.size()));

        // 🔍 Stream filter: files larger than 5 KB
        System.out.println("\nFiles larger than 5 KB:");
        javaFiles.stream()
                .map(Path::toFile)
                .filter(f -> f.length() > 5 * 1024)
                .forEach(f -> System.out.println(f.getName()));
    }
}
