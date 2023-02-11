package question2;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class LongestText {
	public String longestword() throws FileNotFoundException
	{
		String longword=" ";
		String currentword;
		Scanner sc=new Scanner(new File("C:\\javaprogram\\a.txt\\"));
		while(sc.hasNext())
		{
			currentword=sc.next();		
			if(currentword.length()>longword.length())		//comparing the current word and longest word
			{
				longword=currentword;
			}
		}
		System.out.println("\n longets word in the file is "+longword);
				return longword;
		
	}

	public static void main(String[] args) throws FileNotFoundException {
		new LongestText().longestword();
		

	}

}