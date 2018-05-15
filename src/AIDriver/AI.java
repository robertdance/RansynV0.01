package AIDriver;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class AI 
{
	// Will want to rework these class variables somehow so that we can allow the AI to create additional variables for itself.
	private String name;
	private String description;
	private ArrayList<String> attributes;
	private Dictionary dictionary;
	private Conversation conversation;

	public AI(String _name, String _description, Dictionary _dictionary) 
	{
		setName(_name);
		setDescription(_description); 
		setDictionary(_dictionary);
	}

	public String getName()
	{
		return name;
	}

	private void setName(String _name)
	{
		name = _name; 
	}

	public String getDescription()
	{
		return description;
	}

	private void setDescription(String _description)
	{
		description = _description;
	}

	@Override
	public String toString()
	{
		String toString = ">> Name: " + getName() + "\n>> Description: " + getDescription() + getDictionary().toString();
		return toString;
	}
	
	public ArrayList<String> getAttributes()
	{
		return attributes;
	}
	
	private void setAttributes(ArrayList<String> _attributes)
	{
		attributes = _attributes;
	}
	
	private void setDictionary(Dictionary _dictionary)
	{
		dictionary = _dictionary;
	}
	
	public Dictionary getDictionary()
	{
		return dictionary;
	}

	public Conversation getConversation() {
		return conversation;
	}

	public void setConversation(Conversation _conversation) {
		conversation = _conversation;
	}

}
