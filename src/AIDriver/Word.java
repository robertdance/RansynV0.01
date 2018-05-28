package AIDriver;

import java.util.ArrayList;

public class Word 
{
	String word;
	static String[] wordTypes = { "Noun", "Pronoun", "Verb", "Adjective", "Adverb", "Conjunction", "Interjection", "Greeting"};
	ArrayList<String> wordType = new ArrayList<String>();
	String definition;

	public Word(String _word, ArrayList<String> _wordType, String _definition) 
	{
		setWord(_word);
		setWordType(_wordType);
		setDefinition(_definition);
	}

	public String getWord()
	{
		return word;
	}

	public ArrayList<String> getWordType()
	{
		return wordType;
	}

	public String getDefinition()
	{
		return definition;
	}

	public static String[] getWordTypes()
	{
		return wordTypes;
	}

	private void setWord(String _word)
	{
		word = _word;
	}

	private void setWordType(ArrayList<String> _wordTypes)
	{
		wordType = _wordTypes;
	}

	private void setDefinition(String _definition)
	{
		definition = _definition;
	}

	@Override
	public String toString()
	{	
		String toString = ("#" + getWord());
		for(int count = 0; count < getWordType().size(); count++)
		{
			toString = toString + "#" + getWordType().get(count);
		}
		toString = toString + "#" + getDefinition(); 
		System.out.println(toString);
		return toString;
	}

	public String printString()
	{	
		String toString = ("Word: " + getWord() + ", Type of Word: "); 
		for(int count = 0; count < getWordType().size(); count++)
		{
			if(count == 0)
			{
			toString = toString + getWordType();
			}
			else
			{
				toString = toString + ", " + getWordType();
			}
		}
		toString = toString + ", Definition: " + getDefinition(); 
		return toString;
	}

}
