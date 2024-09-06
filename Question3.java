package CoreJava;

import java.util.Scanner;

public class Question3 
{
 public static int CountChar(String s,char cha)
 {
  int count = 0;
  for(int i = 0; i<s.length(); i++) 
  {
	  if (s.charAt(i) == cha)
	  {
		count++;  
	  }
  }
  return count;
 }
 
 public static void main(String[] arg)
 {
	  
	 Scanner s = new Scanner(System.in);
	 System.out.println("Enter the statement : ");
	 String S = s.nextLine();
	 
	 Scanner cha = new Scanner(System.in);
	 System.out.println("Enter the char to count :");
	 char Ch = cha.nextLine().charAt(0);
	 
	 int count = CountChar(S,Ch);
	 System.out.println("The no. of character count is : " + count);
	 

	

	 
 }
}
