package CoreJava;

import java.util.Scanner;

public class Question6 
{
public static double TemperatureConversion(double temp)
{
	double result=0;
	result = ((temp * 1.8)+32);
	return result;
}

public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the temperature in celsius : ");
	double temp = sc.nextDouble();
	
	double result =TemperatureConversion(temp);
	
	System.out.println("The temperature in Fahrenheit is : " + result);

}
}
