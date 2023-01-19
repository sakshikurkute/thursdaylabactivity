package activity09;

public class javahungry 
{
	
		 public static void main(String args[]) {
			int number=123456;
			
			 
			 System.out.println("Given number is: "+ number);
		        int firstDigit = 0;
		        int lastDigit = 0;
		        lastDigit = number % 10;
		        System.out.println("Last Digit is: " + lastDigit);      
		        while(number != 0)
		        {
		            firstDigit = number % 10;
		            number = number / 10;
		        }
		        System.out.println("First Digit is: " + firstDigit);
		        
		 }

	}



