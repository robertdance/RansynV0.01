package AIDriver;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Driver 
{
	static AI Ransyn;
	private final static File AIPERSONALINFO = new File("AIPersonalInfo.txt");

	public static void main(String[] args) 
	{
		setAI(loadAI());
		System.out.println(Ransyn.toString()); 
		checkAnswer();
	}
	private static AI loadAI()
	{
		ArrayList<String> attributes = loadAIInfoFromFile();
		Dictionary _dictionary = new Dictionary();
		AI _ransyn = new AI(attributes.get(0), attributes.get(1), _dictionary);
		return _ransyn;
	}

	private static ArrayList <String> loadAIInfoFromFile()
	{

		try 
		{
			Scanner input = new Scanner(AIPERSONALINFO); 
			input.useDelimiter(", ");
			ArrayList<String> _attributes = new ArrayList<String>();
			while(input.hasNext())
			{
				_attributes.add(input.next());
			}
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

	private static void setAI(AI _ransyn)
	{
		Ransyn = _ransyn;
	}
	private static void checkAnswer()
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