import java.util.Scanner;
public class ConvertKilometerToMiles{
	public static void main(String args[]){
		//Creating a variable km
		double km;
		System.out.println("Enter Kilometers");
		Scanner input = new Scanner(System.in);
		km = input.nextInt();
		double kilometerInMiles=(km/1.6);
		System.out.println("The total miles is "+kilometerInMiles+" miles for the given "+km+" km");
	}
}
