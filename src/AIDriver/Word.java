package AIDriver;

public class Word 
{
	String word;
	static String[] wordTypes = { "noun", "pronoun", "verb", "adjective", "adverb", "conjunction", "interjection"};
	String wordType;
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
	
	public String getWordType()
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
		wordType = _wordType;
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

}
