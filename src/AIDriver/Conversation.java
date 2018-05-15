package AIDriver;

import java.util.ArrayList;
import java.util.Scanner;

public class Conversation 
{
	private static final String console = null;
	ArrayList<Sentance> sentances = new ArrayList<Sentance>();

	public Conversation()
	{

	}

	public void Greeting()
	{
		System.out.println("Greetings. I am learning. Please ask me a question, and I will endevour to answer it...\n");
	}

	public String AskMeAQuestion() 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("\n\nYou: ");
		String answer = input.nextLine();
		if(!answer.equalsIgnoreCase("bloodway"))
		{
			addToConversation(constructSentance(answer));
		}
		//System.out.println(toString());
		return answer;
	}

	public void AnswerQuestion()
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

		Sentance _sentance = new Sentance(_string);
		return _sentance;

	}

	public String toString()
	{
		String toString = null;
		for(int count = 0; count < getSentance().size(); count++)
		{
			if(toString == null)
			{
				toString = getSentance().get(count).toString();
			}
			else
			{
				toString = toString + "\n" + getSentance().get(count).toString();
			}
		}
		return toString;
	}

	private ArrayList<Sentance> getSentance() 
	{
		return sentances;
	}
}
