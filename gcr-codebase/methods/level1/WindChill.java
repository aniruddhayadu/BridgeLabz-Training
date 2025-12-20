/* program calculate the wind chill temperature given the temperature and wind speed*/

import java.util.Scanner;
public class WindChill {
	
    // method to calculate the wind chill temperature 
    public double calculateWindChill(double temperature, double windSpeed) {
	double windChill =  (35.74 + (0.6215 *temperature) + ((0.4275*temperature - 35.75) * Math.pow(windSpeed, 0.16)));
	return windChill;
    }


    public static void main(String[] args) {
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);

        // Take input for temperature and wind speed       	
	System.out.print("Enter temperature and wind speed : ");
        double temperature = sc.nextDouble();
	double windSpeed = sc.nextDouble();
	
	// creating object WindChill
	WindChill obj = new WindChill();

	// Call the method and Display value 
	double windChill = obj.calculateWindChill(temperature, windSpeed);
        
       	System.out.println("the wind chill temperature is : "+windChill);
	
        // Close the Scanner object
        sc.close();
    }
}
