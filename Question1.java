package CoreJava;
import java.util.Scanner;

public class Question1 
{
 public static int Calculate(int a, char ope,int b)
 {
	 int res=0;
	 if(ope == '+')
		 System.out.println(res=a+b);
	 else if(ope == '-')
		 System.out.println(res=a-b);
	 else if(ope =='*')
		 System.out.println(res=a*b);
	 else if(ope == '/')
		 if(b!=0)
			 System.out.println(res=a/b);
		 else 
			 System.out.println("enter another no.");
	 
	 
	 return res;
	 
 }
 public static void main(String[] args)
 {
	Scanner a = new Scanner(System.in);
	System.out.println("Enter first no. :");
    int A = a.nextInt();
    
    Scanner ope = new Scanner(System.in);
    System.out.println("Enter the operator :");
    char operator = ope.next().charAt(0);
    
    Scanner b = new Scanner(System.in);
    System.out.println("Enter the second no. :");
    int B = b.nextInt();
    
    int res = Calculate(A,operator,B);
    
    System.out.println("result is " + res);
    
 }
}
