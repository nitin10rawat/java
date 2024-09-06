package CoreJava;

import java.util.Scanner;

public class Question9 
{
 public static int Factorial(int fact)
 {
	 int result=0;
	 if (fact == 0)
		 return 1;
	 result = fact * Factorial(fact-1);
	return result; 	 
 }
 
 public static void main(String[] args)
 {
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.println("Enter the no. :");
	 int fact = sc.nextInt();
	 
	 sc.close();
	 int result = Factorial(fact);
	 System.out.println("The factorial of the given no. is : " + result);
	  
 }
}

