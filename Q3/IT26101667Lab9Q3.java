public class IT26101667Lab9Q3{
	
	//userdefined 
	public static int add(int x,int y){
		return x + y;
	}
	
	public static int multiply(int x, int y){
		return x * y;
	}
	
	public static int square(int x){
		return x * x;
	}
	
	//predefined
	public static void main(String[] args){
	
		int num1 = square(add(multiply(3,4),multiply(5,7)));
		System.out.print("Results of (3 * 4 + 5 * 7)^2 \t\t:" + num1);
		
		System.out.println("");
		int num2 = add(square(add(4,7)),square((add(8,3))));
		System.out.print("Results of (4 + 7)^2 + (8 + 3)^2 \t:"+ num2);
	
	}

}