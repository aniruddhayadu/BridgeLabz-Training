/* A program to divide N number of chocolates among M children. Print the number of chocolates each child will get and also the remaining chocolates*/


import java.util.Scanner;
public class ChocolatesGetAndRemain {
	
    // to find the number of chocolates each child gets and number of remaining chocolates
    public static int[] findRemainderAndQuotient(int numberOfchocolates, int numberOfChildren) {

        int chocolatesGet = numberOfchocolates/numberOfChildren;
	int remainingChocolates = numberOfchocolates%numberOfChildren;


	return new int[] {chocolatesGet, remainingChocolates};

    }


    public static void main(String[] args) {
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);

        // Take input for nnumber of chocolates and students
        System.out.print("Enter number of chocolates and students : ");
        int numberOfchocolates = sc.nextInt();
	int numberOfChildren = sc.nextInt();
	
	// Call the method and Display value 
	int [] result = findRemainderAndQuotient(numberOfchocolates,numberOfChildren);
        
        System.out.println("The number of chocolates each child will get : "+result[0]);
	System.out.println("Remaining chocolates is: "+result[1]);
	
        // Close the Scanner object
        sc.close();
    }
}
