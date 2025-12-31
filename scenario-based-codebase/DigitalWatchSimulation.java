/*Digital Watch Simulation ⏱️
Simulate a 24-hour watch:
● Print hours and minutes in a nested for-loop.
● Use a break to stop at 13:00 manually (simulate power cut).
Core Java Scenario Based Problem Statements*/

public class DigitalWatchSimulation {
	public static void main(String args[]) {
		System.out.println("Digital Watch Simulation");
		System.out.println();
	
		for(int hour = 1; hour <= 24; hour++) {
			if(hour == 13) {
				System.out.println("13:00");
				break;
			}
			for(int min = 0; min <= 9; min++) {
				System.out.println(hour+":0"+min);
			}
			for(int min = 10; min <= 59; min++) {
				System.out.println(hour+":"+min);
			}
		}

	}
}