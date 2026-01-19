package com.icecreamrush;

public class IceCreamRush {
	// Falvor array to store list of flavors
	public static Flavor[] flavorList = new Flavor[8];
	public static int index = 0;

	/// Method to add flavor in list
	public static void addFlavor(Flavor flavor) {
		if (index < flavorList.length) {
			flavorList[index] = flavor;
			System.out.println(flavor.flavorName + " added successfully ");
			index++;
		} else {
			System.out.println("List full");
		}
	}

	// Method to sort list using bubble sort
	public static void bubbleSort() {
		for (int i = 0; i < flavorList.length; i++) {
			for (int j = i; j < flavorList.length; j++) {
				if (flavorList[i].soldCount < flavorList[j].soldCount) {
					Flavor temp = flavorList[i];
					flavorList[i] = flavorList[j];
					flavorList[j] = temp;
				}
			}
		}
	}

	// Method to display Ice Cream details
	public static void displayFlavor() {

		System.out.println("------------------------------------------");
		System.out.println("Ice Cream Flavor Popularity");
		System.out.println("------------------------------------------");
		System.out.println("Flavor\t\t\tPopularity");
		System.out.println("------------------------------------------");
		for (Flavor fl : flavorList) {
			System.out.println(fl.flavorName + "\t\t" + fl.soldCount);
		}
		System.out.println("------------------------------------------");
	}

	public static void main(String[] args) {

		// Creating object of flavor
		Flavor flavor1 = new Flavor("Vanilla	");
		Flavor flavor2 = new Flavor("Chocolate");
		Flavor flavor3 = new Flavor("Strawberry");
		Flavor flavor4 = new Flavor("Mango	");
		Flavor flavor5 = new Flavor("Butterscotch");
		Flavor flavor6 = new Flavor("Pistachio");
		Flavor flavor7 = new Flavor("BlackCurrant");
		Flavor flavor8 = new Flavor("CookiesAndCream");

		// Adding flavor to list
		System.out.println("------------------------------------------");
		addFlavor(flavor1);
		addFlavor(flavor2);
		addFlavor(flavor3);
		addFlavor(flavor4);
		addFlavor(flavor5);
		addFlavor(flavor6);
		addFlavor(flavor7);
		addFlavor(flavor8);

		// calling method to sold ice cream
		System.out.println("------------------------------------------");
		flavor3.soldIceCream();
		flavor1.soldIceCream();
		flavor7.soldIceCream();
		flavor4.soldIceCream();
		flavor2.soldIceCream();
		flavor5.soldIceCream();
		flavor8.soldIceCream();
		flavor1.soldIceCream();
		flavor6.soldIceCream();
		flavor3.soldIceCream();
		flavor2.soldIceCream();
		flavor4.soldIceCream();
		flavor7.soldIceCream();
		flavor1.soldIceCream();
		flavor5.soldIceCream();
		flavor1.soldIceCream();
		flavor6.soldIceCream();
		flavor1.soldIceCream();
		flavor2.soldIceCream();
		flavor4.soldIceCream();
		System.out.println("------------------------------------------");

		// Calling method to apply sorting
		bubbleSort();

		// Calling method to display IceCream details
		displayFlavor();

	}

}