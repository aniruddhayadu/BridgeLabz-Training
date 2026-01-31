package com.coderepocleaner;

import java.io.IOException;
import java.nio.file.*;
import java.util.*;
import java.util.stream.*;

// Scans folders recursively for Java files
public class JavaFileScanner {

    // Returns all .java file paths
    public static List<Path> scanJavaFiles(String rootDir) throws IOException {

        // Walk through directories recursively
        try (Stream<Path> paths = Files.walk(Paths.get(rootDir))) {
            return paths
                    .filter(Files::isRegularFile)        // Only files
                    .filter(p -> p.toString().endsWith(".java")) // Only .java
                    .collect(Collectors.toList());
        }
    }
}