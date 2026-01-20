package com.foodfest;

public class FoodFest {
	static void mergeSort(Stall[] stalls, int l, int r) {
		if(l < r) {
			int m = l + (r - l) / 2;
			
			mergeSort(stalls, l, m);
			mergeSort(stalls, m + 1, r);
			
			merge(stalls, l, m , r);
		}
	}
	public static void merge(Stall[] stalls, int l, int m, int r) {
		int n1 = m - l + 1;
		int n2 = r - m;
		
		Stall[] L = new Stall[n1];
		Stall[] R = new Stall[n2];
		
		for(int i = 0; i < n1; i++) {
			L[i] = stalls[i + l];
		}
		for(int j = 0; j < n2; j++) {
			R[j] = stalls[j + m + 1];
		}
		
		int i = 0;
		int j = 0;
		int k = l;
		
		while(i < n1 && j < n2) {
			if(L[i].footfall <= R[j].footfall) {
				stalls[k++] = L[i++];
			}
			else {
				stalls[k++] = R[j++];
			}
		}
		
		while(i < n1) {
			stalls[k++] = L[i++];
		}
		while(j < n2) {
			stalls[k++] = R[j++];
		}
	}
	
	public static void displayStalls(Stall[] stalls) {
		 System.out.println("FoodFest Stall Footfall Report");
		 System.out.println("___________________________________");
		 for (Stall stall : stalls) {
	            System.out.println("Stall: " + stall.stallName + " | Footfall: " + stall.footfall);
	        }

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stall[] stalls = {
	            new Stall("Burger Bliss", 120),
	            new Stall("Taco Town", 150),
	            new Stall("Pizza Palace", 150),
	            new Stall("Noodle Hub", 180),
	            new Stall("Sweet Treats", 200),
	            new Stall("Spice Corner", 220)
	        };


		mergeSort(stalls, 0, stalls.length - 1);
		displayStalls(stalls);

	}

}
