package com.lambdaexpressions.hospitalpatientIDprinting;

public class Patient {
	private int id;
	private String name;
	private String problem;
	
	public Patient(int id, String name, String problem) {
		this.id = id;
		this.name = name;
		this.problem = problem;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProblem() {
		return problem;
	}

	public void setProblem(String problem) {
		this.problem = problem;
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", problem=" + problem + "]";
	}
}