package com.medwarehouse;


public class MedWarehouse {

	static Medicine[] medicines;

	static void mergeSort(Medicine[] arr, int left, int right) {

		if (left < right) {

			int mid = (left + right) / 2;
			mergeSort(arr, left, mid);
			mergeSort(arr, mid + 1, right);

			merge(arr, left, mid, right);
		}
	}

	static void merge(Medicine[] arr, int left, int mid, int right) {

		int n1 = mid - left + 1;
		int n2 = right - mid;

		Medicine[] leftArr = new Medicine[n1];
		Medicine[] rightArr = new Medicine[n2];

		for (int i = 0; i < n1; i++) {
			leftArr[i] = arr[left + i];
		}
		for (int j = 0; j < n2; j++) {
			rightArr[j] = arr[mid + 1 + j];
		}

		int i = 0, j = 0, k = left;

		while (i < n1 && j < n2) {

			if (leftArr[i].expiryDays <= rightArr[j].expiryDays) {
				arr[k] = leftArr[i];
				i++;
			} else {
				arr[k] = rightArr[j];
				j++;
			}
			k++;
		}
		
		while (i < n1) {
			arr[k] = leftArr[i];
			i++;
			k++;
		}

		while (j < n2) {
			arr[k] = rightArr[j];
			j++;
			k++;
		}
	}
	
	static void displayMedicines() {

		System.out.println("\n------------------------------------");
		System.out.println("Displaying Medicines by Expiry");
		System.out.println("------------------------------------");

		for (int i = 0; i < medicines.length; i++) {

			System.out.println(
				"Medicine -> " + medicines[i].name +
				", Batch -> " + medicines[i].batchNo +
				", Expiry in -> " + medicines[i].expiryDays + " days"
			);
		}
	}

	public static void main(String[] args) {

		medicines = new Medicine[] {
			new Medicine("Paracetamol", "B101", 30),
			new Medicine("Aspirin", "B102", 10),
			new Medicine("Cough Syrup", "B103", 45),
			new Medicine("Antibiotic", "B104", 5),
			new Medicine("Vitamin C", "B105", 20),
			new Medicine("Insulin", "B106", 3)
		};
		
		mergeSort(medicines, 0, medicines.length - 1);
		displayMedicines();
	}
}
