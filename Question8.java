package CoreJava;

import java.util.Scanner;

public class Question8 
{
	public static boolean IsPalindrome(String str)
	{
	 str = str.toLowerCase();
	 
	 int Left= 0;
	 int Right= str.length()-1;
	 while(Left < Right)
	 {
		 if(str.charAt(Left) != str.charAt(Right))
		 {
			 return false;
		 }
		 Left++;
		 Right--;
	 }
	 return true;
	 
	}
	public static void main(String[] args)
	{
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.println("Enter the string to check if it is a palindrome  :");
	 String str = sc.nextLine();
	 
	 sc.close();
	 
	 if(IsPalindrome(str))
		 System.out.println(str +" is a palindrome ");
	 
	 else
		 System.out.println(str + " is not a palindrome ");
	 
	}
}
