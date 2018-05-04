package AIDriver;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Driver 
{

	private final static File AIPERSONALINFO = new File("AIPersonalInfo.txt");
	
	public static void main(String[] args) 
	{
		LoadAI();
	}
	
	private static void LoadAI()
	{
		String[] attributes = LoadAIInfoFromFile();
		AI Ransyn = new AI(attributes[0], attributes[1]);
	}
	
	private static String[] LoadAIInfoFromFile()
	{

		try 
		{
			if(!AIPERSONALINFO.exists())
			{
				System.out.println("The AI Info File does not exist. Please create it at " + AIPERSONALINFO.getAbsolutePath() + " and then reload the program...");
			}
			else
			{
			Scanner input = new Scanner(AIPERSONALINFO);
			input.useDelimiter(", ");
			String[] _attributes = {input.next(), input.next()};
			System.out.println(">> The AI Attribute File has been loaded successfully <<");
			return _attributes;	
			}
			
		} 
		catch (FileNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	


}
