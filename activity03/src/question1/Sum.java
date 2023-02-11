package question1;
import java.util.Scanner;
class Sum extends ReverseNumber			//here class is extending 
{
	public void sumdigit()			//method to find sum of digit
	{
		System.out.println("Enter the number to find sum");
		Scanner sc=new Scanner(System.in);			//taking user input by using scanner class
		int number=sc.nextInt();

		int sum=0,digit;

		while(number>0)		
		{
			digit=number%10;					//logic for sum of digit number
			sum=sum+digit;
			number=number/10;

		}
		System.out.println("sum of digit is"+sum);
	}
}