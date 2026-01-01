package com.inheritanceeducationalcourse;

public class CourseManagementSystem {
    public static void main(String[] args) {

        Course course = new Course("Data Structures", 40);
        Course onlineCourse = new OnlineCourse("Java Programming", 30, "Udemy", true);
        Course paidCourse = new PaidOnlineCourse(
                "Advanced Java", 50, "Coursera", true, 199.99, 20
        );

        course.displayCourseInfo();
        System.out.println();

        onlineCourse.displayCourseInfo();
        System.out.println();

        paidCourse.displayCourseInfo();
    }
}

