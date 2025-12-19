//program to save odd and even numbers into odd and even arrays between 1 to the number

import java.util.Scanner;

public class OddAndEvenArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();
	
	//checking number is natural
	if (number > 0) {
		int size = (number/2)+1;

		// creating two arrays even and odd
		int evenArray[]=new int [size];
		int oddArray[]=new int [size];
		int oddIndex=0,evenIndex=0;
		for ( int index=1; index <= number; index++ ){
			if (index%2==0){
				evenArray[evenIndex++]=index;
			}
			else {
				oddArray[oddIndex++]=index;
			}
		}
		
		// printing both Odd array

		System.out.print("printing both Odd array ");
		for (int index=0;index<oddIndex;index++) {
			System.out.print(oddArray[index]+" ");
		}

		System.out.println("");
		// printing both Even array

		System.out.print("printing both Even array ");
		for (int index=0;index<evenIndex;index++) {
			System.out.print(evenArray[index]+ " ");
		}
	}
	else { 
		System.out.print("Invalid Number : error");
		System.exit(0);
	}
        input.close();
    }
}
