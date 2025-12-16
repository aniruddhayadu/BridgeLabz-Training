import java.util.*;

public class PerimeterOfARectangle{
	public static void main(String[] args){
		Scanner Sc = new Scanner(System.in);
		double length = Sc.nextDouble();
		double width = Sc.nextDouble();


		double principle = 2* (length + width);
		System.out.println("The volume is " + principle);

	}
}