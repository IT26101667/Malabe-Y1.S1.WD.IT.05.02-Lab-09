import java.util.Scanner;
public class IT26101667Lab9Q4{

	public static double calcfinalMark( double assignmentMark,double examMark){
		return (assignmentMark * 0.3) + (examMark * 0.7);
		}
	
	public static  char findGrades(double finalMark){
		if (finalMark >= 75){
			return 'A';
		}
		else if (finalMark >= 60){
			return 'B';
		}
		else if (finalMark >= 50){
			return 'C';
		}
		else {
			return 'F';
		}
	}
	
	public static void printDetails(String name,double finalMark,char grade){
		System.out.println(name+"\t\t"+String.format("%.2f",finalMark)+"\t\t\t"+grade);
		
		}
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		int assignmentMark[] = new int[5];
		int examMark[] = new int[5];
		String name[] = new String[5];
		double finalMark[] = new double[5];
		char grade[] = new char[5];
		
		for (int count = 0;count < assignmentMark.length;count++){
			System.out.print("Enter Name of Student " + (count+1)+" : ");
			name[count] = input.next();
			
			System.out.print("Enter Assignment Mark (out of 100) for " + name[count]+" : ");
			assignmentMark[count] = input.nextInt();
			
			System.out.print("Enter Exam Paper Mark (out of 100) for " + name[count]+" : ");
			examMark[count] = input.nextInt();
			
			finalMark[count] = calcfinalMark(assignmentMark[count],examMark[count]);
			grade[count] = findGrades(finalMark[count]);
			
			System.out.println("");
		}
	System.out.println("");
	System.out.println("Name\t\tFinal Mark\t\tGrade");
	
	for (int num = 0;num < assignmentMark.length;num++){
		printDetails(name[num],finalMark[num],grade[num]);
	}
	
	
	
	}
	
}