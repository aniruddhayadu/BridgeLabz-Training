import java.util.Scanner;
public class AreaOfTriangle{
	public static void main(String[] args){
		// creating a scanner variable to take user input
		Scanner sc=new Scanner(System.in);

		// creating variables base and height to take user input
		double base=sc.nextDouble(), height=sc.nextDouble();

		// creating variable to calculate area in fer
		double area=0.5*base*height;

		// creating variable to calculate area 
		double areaInch=area/2.54;
		System.out.println("The area of triangle in cm is "+area+" and in Inch is "+areaInch);
}
}