package com.universitydigitalrecord;

public class StudentTree {
	static Student root;
	public static void add(String name, String branch, int semister, int roll) {
		Student student = new Student(name, branch, semister, roll);
		root = insert(student, root);

	}
	public static Student insert(Student student, Student curr) {

		if (curr == null) {
			return student;
		}

		int roll = student.roll;
		if (curr.roll > roll) {
			curr.left = insert(student, curr.left);
		} else {
			curr.right = insert(student, curr.right);
		}

		return curr;

	}
	static void deleteStudent(Student root, int x) {
		delStudent(root, x);
		System.out.println("-------------------------------------------------------");
		System.out.println("Student having roll number " + x + " is deleted successfully");
		System.out.println("-------------------------------------------------------");

	}
	static Student getSuccessor(Student curr) {
		curr = curr.right;
		while (curr != null && curr.left != null) {
			curr = curr.left;
		}
		return curr;
	}

	static Student delStudent(Student root, int x) {
		if (root == null)
			return root;

		if (root.roll > x) {
			root.left = delStudent(root.left, x);
		} else if (root.roll < x) {
			root.right = delStudent(root.right, x);
		} else {
			if (root.left == null)
				return root.right;
			if (root.right == null)
				return root.left;
			Student succ = getSuccessor(root);
			root.roll = succ.roll;
			root.right = delStudent(root.right, succ.roll);
		}
		return root;
	}

	public static void displayInfo(Student curr) {
		System.out.println("--------------------------------------------");
		System.out.println("Name\tBranch\tRoll\tSemister");
		System.out.println("--------------------------------------------");
		display(curr);
	}

	public static void display(Student curr) {

		if (curr == null)
			return;
		display(curr.left);
		System.out.println(curr.name + "\t" + curr.branch + "\t" + curr.roll + "\t" + curr.semister);
		display(curr.right);
	}

	public static void main(String[] args) {

		add("Aniruddha", "Aiml", 7, 6);
		add("Arif", "cse", 7, 4);
		add("Hanuman", "cs", 7, 5);
		add("Aman", "ex", 7, 2);
		add("Ankit", "Aiml", 7, 9);
		add("Aditya", "Cse", 7, 7);
		displayInfo(root);
		deleteStudent(root, 4);
		displayInfo(root);

	}



}
