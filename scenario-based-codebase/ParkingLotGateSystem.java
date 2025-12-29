/* 6. Parking Lot Gate System */
import java.util.Scanner;
public class ParkingLotGateSystem{
	
	
	public static void main(String [] args){
	
	Scanner sc = new Scanner(System.in);
	
	int parkCapacity = 10;
	int park = 0;
	boolean exit = false;
	while(true){
	
		System.out.println("1 for park");
		System.out.println("2 for exit");
		System.out.println("3 for Occupancy");
	

		System.out.print("Choose one Option : ");
	
		int choose = sc.nextInt();
	
		switch(choose){
			case 1 :
				System.out.println("parked");
				park++;
				break;
			case 2 :
				System.out.println("you are succesfully exit");
				exit = true;
				break;
			case 3 :
				System.out.println("total parked : "+ park);
				System.out.println((parkCapacity - park)+" left");
				break;
			default:
                		System.out.println("invalid");
		}
		
		if(exit) {
			System.out.println("succesfully exit ");
			break;
		}
		if(parkCapacity < park) {
			System.out.println("space full");
			break;
		}
		
	}
	System.out.println("Thanks");
	
	}
}