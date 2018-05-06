package AIDriver;

import java.util.Scanner;

public class Conversation 
{
	
	public static void Greeting()
	{
		System.out.println("Greetings. I am learning. Please ask me a question, and I will endevour to answer it...\n");
	}
	
	public static String AskMeAQuestion()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("\n\nYou: ");
		String answer = input.next();
		return answer;
	}
	
	public static void AnswerQuestion()
	{
		System.out.println("Ransyn: ");
	}
}
