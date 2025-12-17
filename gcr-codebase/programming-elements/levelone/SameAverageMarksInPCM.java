public class SameAverageMarksInPCM{
	public static float sameAverageMarksInPCM(){
		float mathsMark=94;
		float physicsMark=95;
		float chemistryMark=96;
		return (mathsMark+physicsMark+chemistryMark)/3;
	}
	public static void main(String args[]){
		System.out.println("Sam's average mark in PCM is :"+sameAverageMarksInPCM());
	}
}