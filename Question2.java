package CoreJava;

import java.util.Scanner;

public class Question2 
{
 public static int Sum(int no)

 {
	 int sum=0;
	 
	 if(no%2 == 0) {
		 System.out.println("The given no. is even");
	 	 sum = no*(no+1);
	 }
	     else 
	     System.out.println("The given no. is odd");
	 
  return sum;
 }
 
 public static void main(String[] args)
 {
	 Scanner no = new Scanner(System.in);
	 System.out.println("Enter a no. :");
	 int NO = no.nextInt();
	 
	int sum = Sum(NO);
	System.out.println("The sum of even no. is = " +sum);
	
 }
}
