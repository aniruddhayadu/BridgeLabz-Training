package com.chatlogparser;

import java.util.*;

//Main application
public class ChatLogParserApp {

 public static void main(String[] args) {

     // Idle chat filter
     MessageFilter<ChatMessage> filter =
             new IdleChatFilter();

     // Parse chat log
     Map<String, List<String>> chats =
             ChatReader.readChats("chatlog.txt", filter);

     // Display results
     System.out.println("---- User Chat Summary ----");
     chats.forEach((user, messages) -> {
         System.out.println("\nUser: " + user);
         messages.forEach(System.out::println);
     });
 }
}