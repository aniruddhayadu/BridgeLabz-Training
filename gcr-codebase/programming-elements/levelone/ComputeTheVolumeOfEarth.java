public class ComputeTheVolumeOfEarth{
	public static void main(String args[]){
		//Volume of a Sphere is (4/3) * pi * r^3 and radius of earth is 6378 km
		//creating the radius variable
		double radius=6378;
		double volumeOfEarth=(4/3)*3.14*radius*radius*radius;
		double volumeInMiles=volumeOfEarth*1.6;
		System.out.println("The volume of earth in cubic kilometers is "+volumeOfEarth+" and cubic miles is "+volumeInMiles);
	}
}