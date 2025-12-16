import java.util.*;

public class CalculateSimpleInterest{
	public static void main(String[] args){
		Scanner Sc = new Scanner(System.in);
		double principal = Sc.nextDouble();
		double rate = Sc.nextDouble();
		double time = Sc.nextDouble();

		double simpleInterest = (principal * rate * time) / 100;
		System.out.println("The volume is " + simpleInterest);

	}
}