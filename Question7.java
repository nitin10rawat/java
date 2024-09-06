package CoreJava;

import java.util.Scanner;

public class Question7 
{
 public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the percentage : ");
	float per = sc.nextFloat();
	
	if(per<=100 && per>=90)
		System.out.println("Your percentage is : "+ per + "grade is "+ 'A');
	
		else if (per<90 && per>=80)
		System.out.println("Your percentage is : "+ per + "grade is "+ 'B');
	
		else if(per<80 && per>=70)
		System.out.println("Your percentage is : "+ per + "grade is "+ "C");
	
		else if(per<70 && per>=60)
		System.out.println("Your percentage is : "+ per + "grade is "+ "D");
	
		else if(per<60 && per>=50)
		System.out.println("Your percentage is : "+ per + "grade is "+ "E");
		else 
			System.out.println("Your percentage is : "+ per + "grade is "+ "F");
	sc.close();
}

}
