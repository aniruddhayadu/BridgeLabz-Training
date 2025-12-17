public class PensPerStudent{
	public static int nonDistributedPens(int totalPens,int numberOfStudents){
		return (totalPens%numberOfStudents);
	}
	public static int pensPerStudent(int totalPens,int numberOfStudents){
		return (totalPens/numberOfStudents);
	}
	public static void main(String args[]){
		int totalPens=14;
		int numberOfStudents=3;
		System.out.println("The Pen Per Student is "+pensPerStudent(totalPens,numberOfStudents)+" and the remaining pen not distributed is "+nonDistributedPens(totalPens,numberOfStudents));
	}
}