package com.inheritance.schoolsystem;

public class SchoolSystem {
    public static void main(String[] args) {

        Teacher teacher = new Teacher("Alice", 35, "Mathematics");
        Student student = new Student("Bob", 15, 10);
        Staff staff = new Staff("Charlie", 40, "Administration");

        teacher.displayRole();
        System.out.println();

        student.displayRole();
        System.out.println();

        staff.displayRole();
    }
}
