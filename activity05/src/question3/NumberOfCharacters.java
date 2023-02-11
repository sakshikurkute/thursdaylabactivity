package question3;

import java.io.*;

public class NumberOfCharacters {
	static int line=0,character=0,words=0;
	static int content=0;
	public static void totalcount(FileInputStream fin) throws IOException
	{
		while(fin.available()!=0)			//checking the content available in file or not
		{
			content=fin.read();
			if(content!=10)					//linefeed
				character++;
			if(content==32)						//spacing character
				words++;
			if(content==13)						//new line
			{
				line++;						//incrementing the line by 1
				words++;					//incrementing the word by 1
			}
		}
		fin.close();				//closing of file
	}

	public static void main(String[] args) {
		try
		{
			FileInputStream fin=new FileInputStream("C:\\javaprogram\\a.txt");			//taking file as input
			totalcount(fin);
		}
		catch(FileNotFoundException e)			//if file not found in try block throws exception
		{										//and catch block catch it 
			System.out.println("File Not Found");
		}
		catch(IOException i)				//if file not found in try block and exception cann't-
		{										//-handled by upper catch block then this block will handle it
			System.out.println("file not able to read...");	
		}
		System.out.println("number of characters are  "+character);
		System.out.println("number of words are "+words);
		System.out.println("number of lines are "+line+1);
		
	}

}