package AIDriver;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Driver 
{
	static AI Ransyn;
	private final static File AIPERSONALINFO = new File("AIPersonalInfo.txt");
	
	public static void main(String[] args) 
	{
		SetAI(LoadAI());
		System.out.println(Ransyn.toString()); 
	}
	
	private static AI LoadAI()
	{
		String[] attributes = LoadAIInfoFromFile();
		AI _ransyn = new AI(attributes[0], attributes[1]);
		return _ransyn;
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
	
	private static void SetAI(AI _ransyn)
	{
		Ransyn= _ransyn;
	}
	


}
