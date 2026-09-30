import java.util.Scanner;
public class IT26101667Lab9Q2{
	
	//userdefined 
	public static double circleArea(double radius){
		return Math.PI * Math.pow(radius,2);
	}
	//predefined
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the radius of the circle : ");
		double radius = input.nextDouble();
		
		double area = circleArea(radius);
		System.out.print("The area of the circle with radius " + radius + ": " + area);
	
	}

}