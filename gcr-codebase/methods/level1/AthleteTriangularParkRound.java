// A program to check how many rounds must the athlete complete


import java.util.Scanner;
public class AthleteTriangularParkRound {

     // calculating KM in 1 round and compute the number of rounds
     public int distanceInOneRound(int firstSide, int secondSide, int thirdSide) {
        
        int perimeter = firstSide+secondSide+thirdSide;  
	int distance=perimeter/1000;	    
        return distance;
    }	

 
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);

        // Take input for sides of trangle in meters
        System.out.print("Enter sides of trangle in meters : ");
        int firstSide = sc.nextInt();
	int secondSide = sc.nextInt();
	int thirdSide = sc.nextInt();

	

        // Create a AthleteTriangularPark object
        AthleteTriangularParkRound obj = new AthleteTriangularParkRound();

        // Call the Method to compute the number of rounds
	int oneRound=obj.distanceInOneRound(firstSide, secondSide, thirdSide);
        int noOfRounds = (5+(oneRound-1))/oneRound; 

        // Display value 
        System.out.println("The number of rounds to complete 5 km : " +noOfRounds);

        // Close the Scanner object
        sc.close();
    }
}
