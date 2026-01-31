package com.coderepocleaner;

import java.io.File;
import java.nio.file.Path;
import java.util.*;

// Organizes files by quality
public class FileOrganizer {

    // Categorizes Java files
    public static Map<FileType, List<File>> organize(List<Path> paths) {

        Map<FileType, List<File>> map = new EnumMap<>(FileType.class);

        // Initialize map
        for (FileType type : FileType.values()) {
            map.put(type, new ArrayList<>());
        }

        // Analyze each file
        for (Path path : paths) {
            FileType type = CodeAnalyzer.analyze(path);
            map.get(type).add(path.toFile());
        }

        return map;
    }
}
