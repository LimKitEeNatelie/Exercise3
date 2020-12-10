
public class SumAverageRunningInt {

	public static void main(String[] args) {
		int sum = 0; 
		double average; 
		int lowerbound = 1;
		int upperbound = 100;
		
		for (int number = lowerbound; number <= upperbound; ++number) {
		sum += number; 
	}
		average =sum/100;
		System.out.println("ForLoop: The sum of 1 to 100 is " +sum);
		System.out.println("ForLoop: The average is " +average);
		
		//Dowhile Loop
		int sum1=0;
		double average1;
		int lower1 = 1;
		int upper1 = 100;
		int number1 = lower1;
		
		do {
			sum1 += number1; 
			number1++;
		} while (number1 <= upper1); 
		average1 =sum1/100;
		System.out.println("DoWhile: The sum of 1 to 100 is " +sum1);
		System.out.println("DoWhile: The average is " +average1);
		
		
		//WhileLoop
		int sum2=0;
		double average2;
		int lower2 = 1;
		int upper2 = 100;
		int number2 = lower2;
		
		while(number2 <= upper2){
			sum2 += number2; 
			number2++;
		}
		average2 =sum2/100;
			System.out.println("While: The sum of 1 to 100 is " +sum2);
			System.out.println("While: The average is " +average2);
			
		
		
		
		
		
		
		
		
		
		

	}
	
}
