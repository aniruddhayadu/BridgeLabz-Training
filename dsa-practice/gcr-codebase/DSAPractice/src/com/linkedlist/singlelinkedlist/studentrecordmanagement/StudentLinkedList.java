package com.linkedlist.singlelinkedlist.studentrecordmanagement;


class StudentLinkedList {

	 private StudentNode head; // Head of the linked list

	 // Add student at the beginning
	 public void addAtBeginning(int roll, String name, int age, char grade) {
	     StudentNode newNode = new StudentNode(roll, name, age, grade);
	     newNode.next = head;
	     head = newNode;
	     System.out.println("Student added at beginning.");
	 }

	 // Add student at the end
	 public void addAtEnd(int roll, String name, int age, char grade) {
	     StudentNode newNode = new StudentNode(roll, name, age, grade);

	     if (head == null) {
	         head = newNode;
	         System.out.println("Student added as first record.");
	         return;
	     }

	     StudentNode temp = head;
	     while (temp.next != null) {
	         temp = temp.next;
	     }
	     temp.next = newNode;
	     System.out.println("Student added at end.");
	 }

	 // Add student at a specific position (1-based index)
	 public void addAtPosition(int position, int roll, String name, int age, char grade) {

	     if (position <= 1) {
	         addAtBeginning(roll, name, age, grade);
	         return;
	     }

	     StudentNode newNode = new StudentNode(roll, name, age, grade);
	     StudentNode temp = head;

	     for (int i = 1; i < position - 1 && temp != null; i++) {
	         temp = temp.next;
	     }

	     if (temp == null) {
	         System.out.println("Invalid position.");
	         return;
	     }

	     newNode.next = temp.next;
	     temp.next = newNode;
	     System.out.println("Student added at position " + position);
	 }

	 // Delete student by roll number
	 public void deleteByRollNumber(int roll) {

	     if (head == null) {
	         System.out.println("List is empty.");
	         return;
	     }

	     if (head.rollNumber == roll) {
	         head = head.next;
	         System.out.println("Student record deleted.");
	         return;
	     }

	     StudentNode temp = head;
	     while (temp.next != null && temp.next.rollNumber != roll) {
	         temp = temp.next;
	     }

	     if (temp.next == null) {
	         System.out.println("Student not found.");
	     } else {
	         temp.next = temp.next.next;
	         System.out.println("Student record deleted.");
	     }
	 }

	 // Search student by roll number
	 public void searchByRollNumber(int roll) {

	     StudentNode temp = head;

	     while (temp != null) {
	         if (temp.rollNumber == roll) {
	             System.out.println("Student Found:");
	             displayStudent(temp);
	             return;
	         }
	         temp = temp.next;
	     }

	     System.out.println("Student not found.");
	 }

	 // Update grade by roll number
	 public void updateGrade(int roll, char newGrade) {

	     StudentNode temp = head;

	     while (temp != null) {
	         if (temp.rollNumber == roll) {
	             temp.grade = newGrade;
	             System.out.println("Grade updated successfully.");
	             return;
	         }
	         temp = temp.next;
	     }

	     System.out.println("Student not found.");
	 }

	 // Display all students
	 public void displayAll() {

	     if (head == null) {
	         System.out.println("No student records available.");
	         return;
	     }

	     StudentNode temp = head;
	     System.out.println(" Student Records ");

	     while (temp != null) {
	         displayStudent(temp);
	         temp = temp.next;
	     }
	 }

	 // Helper method to display one student
	 private void displayStudent(StudentNode student) {
	     System.out.println(
	             "Roll No : " + student.rollNumber +
	             ", Name : " + student.name +
	             ", Age : " + student.age +
	             ", Grade : " + student.grade
	     );
	 }
}
