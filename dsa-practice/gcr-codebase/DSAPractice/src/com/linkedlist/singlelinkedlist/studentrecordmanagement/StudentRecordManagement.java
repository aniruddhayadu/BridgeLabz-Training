package com.linkedlist.singlelinkedlist.studentrecordmanagement;

public class StudentRecordManagement {

	 public static void main(String[] args) {

	     StudentLinkedList list = new StudentLinkedList();

	     // Adding students
	     list.addAtBeginning(1, "Arif", 21, 'A');
	     list.addAtEnd(2, "Rahul", 22, 'B');
	     list.addAtEnd(3, "Sneha", 20, 'A');
	     list.addAtPosition(2, 4, "Neha", 21, 'C');

	     // Display records
	     list.displayAll();

	     // Search student
	     list.searchByRollNumber(2);

	     // Update grade
	     list.updateGrade(3, 'A');

	     // Delete student
	     list.deleteByRollNumber(1);

	     // Display updated list
	     list.displayAll();
	 }
}
