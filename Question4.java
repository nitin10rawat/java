package CoreJava;

import java.util.Scanner;

public class Question4 
{
 public static int MultiplicationTable(int no)
 {
	 int result=0;
	 for(int i=1; i<=10; i++)
	     System.out.println( no+ "*" +i + "=" + no*i);
	 
	 return result;
 }
 
 public static void main(String[] args)
 {
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.println("Enter the no. : ");
	 int No = sc.nextInt();
	 
	 MultiplicationTable(No);
	 
 }
}
