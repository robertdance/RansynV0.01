package AIDriver;

public class Word 
{
	String word;
	static String[] wordTypes = { "noun", "pronoun", "verb", "adjective", "adverb", "conjunction", "interjection"};
	String wordType;
	String definition;
	
	public Word(String _word, String _wordType, String _definition)
	{
		SetWord(_word);
		SetWordType(_wordType);
		SetDefinition(_definition);
	}
	
	public String GetWord()
	{
		return word;
	}
	
	public String GetWordType()
	{
		return wordType;
	}
	
	public String GetDefinition()
	{
		return definition;
	}
	
	public static String[] GetWordTypes()
	{
		return wordTypes;
	}
	
	private void SetWord(String _word)
	{
		word = _word;
	}
	
	private void SetWordType(String _wordType)
	{
		wordType = _wordType;
	}
	
	private void SetDefinition(String _definition)
	{
		definition = _definition;
	}

}
