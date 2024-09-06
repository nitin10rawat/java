package CoreJava;

import java.util.Scanner;

public class Question10 
{
 public static int MaxOfNumber(int no1,int no2,int no3)
 {
	 int max=0;
	 if(no1>no2 && no1>=no3)
		 max=no1;
	 else if(no2>no3)
		 max=no2;
		 else
			 max=no3;
	 return max;
 }
 
 public static void main(String[] args)
 {
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.println("Enter 3 no.");
	 System.out.println("Enter first no. :");
	 int no1 =sc.nextInt();
	 
	 System.out.println("Enter second no. :");
	 int no2 =sc.nextInt();
	 
	 System.out.println("Enter third no. :");
	 int no3 =sc.nextInt();
	 
	 sc.close();
	 int max =MaxOfNumber(no1, no2, no3);
	 
	 System.out.println("The max of given no. is " + max);
 }
}
