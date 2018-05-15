package AIDriver;

import java.util.ArrayList;
import java.util.Scanner;

public class Sentance 
{
	/* ** Basic word types ** */
	String noun; // Person, place or a thing
	String pronoun; //
	String verb; // An action
	String adjective; // Describes a noun
	String adverb; // Describes other words (not nouns)
	String conjunction; //
	String interjection; //

	String subject; //The noun or noun that perform the action  
	String object; //The noun or nouns that receive the action

	final String SPACE = " ";

	ArrayList<String> words = new ArrayList<String>();

	public Sentance(String _words)
	{
		Scanner input = new Scanner(_words);
		input.useDelimiter(SPACE);
		if(!input.hasNext())
		{
			setWord(_words);
		}
		else
		{
			do
			{
				setWord(input.next());
			}
			while(input.hasNext());
		}
	}

	/* ** Basic Sentence Structures ** */
	private String SubjectVerb()
	{
		String response = subject + SPACE + verb;
		return response;
	}

	private String SubjectVerbObject()
	{
		String response = subject + SPACE + verb + SPACE + object;
		return response;
	}

	private String SubjectVerbAdjective()
	{
		String response = subject + SPACE + verb + SPACE + adjective;
		return response;
	}

	private String SubjectVerbAdverb()
	{
		String response = subject + SPACE + verb + SPACE + adverb;
		return response;
	}

	private String SubjectVerbNoun()
	{
		String response = subject + SPACE + verb + SPACE + noun;
		return response;
	}

	private void setWord(String _word)
	{
		getWords().add(_word);
	}

	public ArrayList<String> getWords()
	{
		return words;
	}

	public String toString()
	{
		String toString = null;
		for(int count = 0; count < getWords().size(); count++)
		{
			if(toString == null)
			{
				toString = getWords().get(count);
			}
			else if(toString != null)
			{
				toString = toString + SPACE + getWords().get(count);
			}
		}
		return toString;
	}
}
