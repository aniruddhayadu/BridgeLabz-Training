package com.chatlogparser;

import java.io.*;
import java.util.*;
import java.util.regex.*;

// Reads and parses chat log files
public class ChatReader {

    // Regex to extract time, user, message
    private static final Pattern CHAT_PATTERN =
            Pattern.compile("\\[(.*?)\\]\\s+(.*?):\\s+(.*)");

    // Reads chat file and groups messages by user
    public static Map<String, List<String>> readChats(
            String filePath,
            MessageFilter<ChatMessage> filter) {

        // TreeMap keeps users sorted alphabetically
        Map<String, List<String>> chatMap = new TreeMap<>();

        try (BufferedReader br =
                     new BufferedReader(new FileReader(filePath))) {

            String line;

            while ((line = br.readLine()) != null) {

                Matcher matcher = CHAT_PATTERN.matcher(line);

                // Skip malformed lines
                if (!matcher.matches()) continue;

                ChatMessage msg = new ChatMessage(
                        matcher.group(1),
                        matcher.group(2),
                        matcher.group(3)
                );

                // Apply generic filter
                if (!filter.allow(msg)) continue;

                // Store message by user
                chatMap
                        .computeIfAbsent(msg.getUser(),
                                k -> new ArrayList<>())
                        .add(msg.toString());
            }

        } catch (IOException e) {
            System.out.println("Error reading chat logs: " + e.getMessage());
        }

        return chatMap;
    }
}
