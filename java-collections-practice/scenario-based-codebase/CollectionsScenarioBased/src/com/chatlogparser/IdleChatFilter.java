package com.chatlogparser;

import java.util.*;

//Filters out idle / non-productive chat
public class IdleChatFilter implements MessageFilter<ChatMessage> {

 private Set<String> idleKeywords =
         Set.of("lol", "brb", "haha", "ok", "cool");

 @Override
 public boolean allow(ChatMessage msg) {

     String text = msg.getMessage().toLowerCase();

     // Reject if message contains idle keywords
     for (String keyword : idleKeywords) {
         if (text.contains(keyword)) {
             return false;
         }
     }
     return true;
 }
}
