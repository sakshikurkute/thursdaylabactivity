package question1;
import java.util.Scanner;

class  ReverseNumber
{
	public void reverse()					//method for reverse number
	{
		System.out.println("enetr the number to reverse:");
		 Scanner sc = new Scanner(System.in);			//taking user input by using scanner class
		int number=sc.nextInt();		

		int reverse=0;

		while(number!=0)
		{
			int remainder=number%10;				//logic for reverse number
			reverse=reverse*10+remainder;
			number=number/10;
		}
		System.out.println("The reverse of the given no is:"+reverse);		//printing the reverse number


	}
}