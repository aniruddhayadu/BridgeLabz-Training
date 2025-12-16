import java.util.*;

public class AverageOfThreeNumbers{
	public static void main(String[] args){
		Scanner Sc = new Scanner(System.in);
		int a = Sc.nextInt();
		int b = Sc.nextInt();
		int c = Sc.nextInt();


		int ans = (a+b+c)/3;
		System.out.println("The answer  is " + ans);

	}
}

