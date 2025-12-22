import java.util.Scanner;

public class CollinearCheck {

    // Slope method to check collinearity
    public static boolean areCollinearBySlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        
        double slopeAB = (double)(y2 - y1) / (x2 - x1);
        double slopeBC = (double)(y3 - y2) / (x3 - x2);
	double slopeAC = (double)(y3 - y1) / (x3 - x1);
  
        return ((slopeAB == slopeBC)&&(slopeAC == slopeBC));
    }

    // Area method to check collinearity
    public static boolean areCollinearByArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        double area = 0.5 * (x1*(y2 - y3) + x2*(y3 - y1) + x3*(y1 - y2));
        return area == 0.0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter x1 y1: ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        System.out.println("Enter x2 y2: ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        System.out.println("Enter x3 y3: ");
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();

        boolean slopeCheck = areCollinearBySlope(x1, y1, x2, y2, x3, y3);
        boolean areaCheck = areCollinearByArea(x1, y1, x2, y2, x3, y3);

	System.out.println("check collinearity By Slope :"+slopeCheck);
	System.out.println("check collinearity By Area :"+areaCheck);
        
        sc.close();
    }
}
