//  a program to checking spring season


import java.util.Scanner;
public class SpringSeasonMethod {
	
    	// Method to to checking spring season

    	public String  checkSpringSeason(int date, int month) {
        
        // checking number
	if ((month == 3 && date >= 20) || (month == 6 && date <= 20) || (month == 4 || month == 5)) {
	    return("Its a Spring Season");
	} 
	else {
    	    return ("Not a Spring Season");
	}

    }



    public static void main(String[] args) {
       	// Create a Scanner Object
	Scanner input = new Scanner(System.in);
	// Get input value for date and month
	System.out.println("Enter the Date and Month");
	int date = input.nextInt();	
	int month=input.nextInt();


        // Create a SpringSeasonMethod object
        SpringSeasonMethod obj = new SpringSeasonMethod(); 


        // Display value 
        System.out.println(obj.checkSpringSeason(date, month));

        // Close the Scanner object
        input.close();
    }
}
