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
		CheckAnswer();
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
			Scanner input = new Scanner(AIPERSONALINFO); 
			input.useDelimiter(", ");
			String[] _attributes = {input.next(), input.next()};
			System.out.println(">> The AI Attribute File has been loaded successfully <<");
			input.close();
			return _attributes;	
		} 
		catch (FileNotFoundException e) 
		{
			System.out.println("The AI Info File does not exist. Please create it at " + AIPERSONALINFO.getAbsolutePath() + " and then reload the program...");
			e.printStackTrace();
		}
		return null;
	}

	private static void SetAI(AI _ransyn)
	{
		Ransyn = _ransyn;
	}
	private static void CheckAnswer()
	{
		boolean exit = false;
		Conversation.Greeting();
		do
		{
			String _answer = Conversation.AskMeAQuestion();
			switch(_answer)
			{
			case "exit":
			{
				System.out.println("Ransyn: Thank you. Have a great day!");
				exit = true;
				break;
			}
			default:
			{
				Conversation.AnswerQuestion();
			}
			}
		}
		while(exit == false);


	}
}