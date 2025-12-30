/*11. Temperature Logger 🌡️
Record temperatures over 7 days.
● Use array and for-loop.
● Find average and max temperature.
● Use if for comparisons. Maintain readable naming and modular code blocks.
*/

import java.util.Scanner;
public class TemperatureLogger {

	public static void main(String[] args) {
		
		// scanner block
		Scanner sc = new Scanner(System.in);
		double temperature[] = new double[7];
	
		double totalTemperature = 0;
		double maxTemperature = 0;
		
		for (int i = 0; i < 7; i++) {
			int day = i + 1;
			System.out.println("Enter temperature of day : "+ day);
			temperature[i] = sc.nextDouble();
		}
		
		for (int i = 0; i < 7; i++) {
			int day = i + 1;
			System.out.println("Temperature of day : "+ day +" " +temperature[i]);
			
			totalTemperature += temperature[i];
			if (maxTemperature < temperature[i]) {
				maxTemperature = temperature[i];
			}
		}

		double averageTemperature = totalTemperature / 7;
		System.out.println("Average Temperature is : "+ averageTemperature +" \nand maximum temperature is : "+maxTemperature);

		sc.close();
	}
}
