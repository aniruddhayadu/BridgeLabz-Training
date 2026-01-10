package com.skillforge;
import java.util.*;

class Instructor extends User {

   public Instructor(String name, String email) {
       super(name, email);
   }

   public void displayRole() {
       System.out.println("Role: Instructor");
   }
}