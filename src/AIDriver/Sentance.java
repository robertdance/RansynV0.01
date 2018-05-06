package AIDriver;

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
}
