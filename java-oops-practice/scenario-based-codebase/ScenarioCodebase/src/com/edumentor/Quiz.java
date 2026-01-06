package com.edumentor;

public class Quiz {
	private String [] questions;
	private String [] answers;
	private int score;
	private int difficultyLevel;
	
	public Quiz(String[] questions, String[] answers) {
        this(questions, answers, 1);
    }

    public Quiz(String[] questions, String[] answers, int difficultyLevel) {
        this.questions = questions;
        this.answers = answers;
        this.difficultyLevel = difficultyLevel;
        this.score = 0;
    }

    public String[] getQuestions() {
        return questions;
    }

    public int getScore() {
        return score;
    }

    public void submitAnswers(String[] userAnswers) {
        for (int i = 0; i < answers.length; i++) {
            if (answers[i].equals(userAnswers[i])) {
                score += 10 * difficultyLevel;
            }
        }
    }

    public double calculatePercentage() {
        int total = answers.length * 10 * difficultyLevel;
        return (double) score / total * 100; 
    }
	
}
