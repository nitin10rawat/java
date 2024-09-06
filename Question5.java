package CoreJava;

import java.util.Scanner;

public class Question5 
{
 public static int SumOfDigits(int no)
 {

	 int result=0;
	 for (int i=no; i>=0; i++)
	 {
			 int nno=no%10;
			 result= result +nno;
			 no=no/10;
	 }
	 return result;
 }
 public static void main(String[] args)
{
 Scanner sc = new Scanner(System.in);
 
 System.out.println("Enter the no. : ");
 int No = sc.nextInt();
 
 int result= SumOfDigits(No);
 System.out.println("the sum of digits is : "+ result);
}
}
