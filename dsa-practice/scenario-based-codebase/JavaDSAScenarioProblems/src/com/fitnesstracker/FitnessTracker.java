package com.fitnesstracker;

public class FitnessTracker {

	static int listSize = 0;
	static User[] userList = new User[listSize];


	public static void addUser(String name, int stepCount) {
		User user = new User(name, stepCount);
		if (listSize <= userList.length) {
			User[] temp = new User[++listSize];
			for (int i = 0; i < listSize - 1; i++) {
				temp[i] = userList[i];
			}
			temp[listSize - 1] = user;
			userList = temp;
			System.out.println(listSize + ") user added to leader board successfully ");
		}

	}

	
	public static void sort() {
		for (int i = 0; i < userList.length; i++) {
			for (int j = i; j < userList.length; j++) {
				if (userList[i].stepsCount < userList[j].stepsCount) {
					User temp = userList[i];
					userList[i] = userList[j];
					userList[j] = temp;
				}
			}
		}
	}


	public static void displayLeaderBoard() {
		System.out.println("-----------------------------");
		System.out.println("Leader Board");
		System.out.println("-----------------------------");
		System.out.println("Name\t\tStep Count");
		System.out.println("-----------------------------");
		int i = 1;
		for (User u : userList) {
			System.out.println((i) + " ) " + u.name + "\t" + u.stepsCount);
			i++;
		}
		System.out.println("-----------------------------");

	}

	public static void main(String[] args) {
		addUser("Arif", 8450);
		addUser("Mithun", 10230);
		addUser("Aditya", 7650);
		addUser("Hanuman", 12040);
		addUser("Princi", 9340);
		addUser("Vishal", 15620);
		addUser("Devu", 6890);
		addUser("Rohan", 11075);
		addUser("Anurag", 9800);



		sort();

		displayLeaderBoard();

	}

}
