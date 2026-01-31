package com.coderepocleaner;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.regex.*;

// Analyzes Java source code
public class CodeAnalyzer {

    // Regex for method names (camelCase)
    private static final Pattern METHOD_PATTERN =
            Pattern.compile("\\b(public|private|protected)?\\s+\\w+\\s+([A-Z][a-zA-Z0-9_]*)\\s*\\(");

    // Regex for import statements
    private static final Pattern IMPORT_PATTERN =
            Pattern.compile("^import\\s+([\\w\\.]+);", Pattern.MULTILINE);

    // Analyzes a file and returns its category
    public static FileType analyze(Path file) {

        try {
            String content = Files.readString(file);

            // Check method naming violations
            Matcher methodMatcher = METHOD_PATTERN.matcher(content);
            if (methodMatcher.find()) {
                return FileType.ERRORS;
            }

            // Check unused imports
            Set<String> imports = extractImports(content);
            for (String imp : imports) {
                if (!content.contains(simpleName(imp))) {
                    return FileType.WARNINGS;
                }
            }

            return FileType.VALID;

        } catch (IOException e) {
            return FileType.ERRORS;
        }
    }

    // Extracts import statements
    private static Set<String> extractImports(String content) {
        Set<String> imports = new HashSet<>();
        Matcher matcher = IMPORT_PATTERN.matcher(content);
        while (matcher.find()) {
            imports.add(matcher.group(1));
        }
        return imports;
    }

    // Gets class name from full import
    private static String simpleName(String fullName) {
        return fullName.substring(fullName.lastIndexOf('.') + 1);
    }
}