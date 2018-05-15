package AIDriver;

import java.util.ArrayList;
import java.util.Scanner;

public class Conversation 
{
	ArrayList<Sentance> sentances = new ArrayList<Sentance>();
	
	public Conversation()
	{
		
	}
	
	public static void Greeting()
	{
		System.out.println("Greetings. I am learning. Please ask me a question, and I will endevour to answer it...\n");
	}
	
	public static String AskMeAQuestion() 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("\n\nYou: ");
		String answer = input.next();
		addToConversation(constructSentance(answer));
		return answer;
	}
	
	public static void AnswerQuestion()
	{
		System.out.println("Ransyn: ");
	}
	
	private void addToConversation(Sentance _sentance)
	{
		getSentances().add(_sentance);
	}
	
	public ArrayList<Sentance> getSentances()
	{
		return sentances;
	}
	
	private Sentance constructSentance(String _string)
	{
		return null; // need to add a Sentance variable here.
	}
}
