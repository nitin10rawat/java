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
	 {
		 if(b!=0)
			 System.out.println(res=a/b);
		 else 
			 System.out.println("enter another no.");
	 }
	 return res;	 
 }
 public static void main(String[] args)
 {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first no. :");
    int sc = a.nextInt();
    
    System.out.println("Enter the operator :");
    char sc = ope.next().charAt(0);
    
    System.out.println("Enter the second no. :");
    int sc = b.nextInt();
    
    int res = Calculate(A,operator,B);
    
    System.out.println("result is " + res);
    sc.close();
 }
}
