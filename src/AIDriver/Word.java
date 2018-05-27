package AIDriver;

import java.util.ArrayList;

public class Word 
{
	String word;
	static String[] wordTypes = { "Noun", "Pronoun", "Verb", "Adjective", "Adverb", "Conjunction", "Interjection"};
	ArrayList<String> wordType;
	String definition;
	
	public Word(String _word, String _wordType, String _definition) 
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
	
	private void setWordType(String _wordType)
	{
		wordType.add(_wordType);
	}
	
	private void setDefinition(String _definition)
	{
		definition = _definition;
	}
	
	@Override
	public String toString()
	{	
		String toString = ("#" + getWord() + "#" + getWordType() + "#" + getDefinition()); 
		return toString;
	}
	
	public String printString()
	{	
		String toString = ("Word: " + getWord() + ", Type of Word: " + getWordType() + ", Definition: " + getDefinition()); 
		return toString;
	}

}
