package question1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileContent{
	static void readwrite() throws IOException
	{
		System.out.println("enter choice one for write and second for read");
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();			//taking user input for choice
		if(i==1)
		{
			FileOutputStream fout=new FileOutputStream("C:\\javaprogram\\a.txt");
			String s="I am proud to be an Indian";		//passsing the string to write into the file
			byte[] b=s.getBytes();
			fout.write(b);
			fout.close();				//closing writing file	
		}
		else if(i==2)
		{
			FileInputStream fin=new FileInputStream("C:\\javaprogram\\a.txt");
			
			while((i=fin.read())!=-1)		//reading the chracter upto the end of the file
			{
				System.out.print((char)i);			//printing the charcters
			}
			fin.close();		//closing the reading file
		}
		else
		{
			System.out.println("please eneter a valid input");
		}
		System.out.println("\nSuccessfully done");
	}
	

	public static void main(String[] args) {
		try
		{
			readwrite();		       //	calling a method
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		

	}

}
