package com.edumentor;

public class EduMentorApp {
    public static void main(String[] args) {

        Learner learner = new Learner("Princi", "princi@mail.com", 101, true);

        String[] questions = {
            "What is Java?",
            "What is OOP?"
        };

        String[] correctAnswers = {
            "Programming Language",
            "Object Oriented Programming"
        };

        Quiz quiz = new Quiz(questions, correctAnswers, 2);

        String[] userAnswers = {
            "Programming Language",
            "Object Oriented Programming"
        };

        quiz.submitAnswers(userAnswers);

        System.out.println("Score: " + quiz.getScore());
        System.out.println("Percentage: " + quiz.calculatePercentage() + "%");

        learner.generateCertificate(); 
    }
}
