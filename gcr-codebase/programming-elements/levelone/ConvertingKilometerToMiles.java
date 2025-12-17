public class ConvertingKilometerToMiles{
	public static float convertingKilometerToMiles(){
	float distance=(float)10.8;
	return (float)1.6*distance;
	}
	public static void main(String args[]){
		System.out.println("The distance 10 km in miles is : "+convertingKilometerToMiles());
	}
}