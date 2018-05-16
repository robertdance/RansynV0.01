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

	public AI(String _name, String _description, Dictionary _dictionary, Conversation _conversation) 
	{
		setName(_name);
		setDescription(_description); 
		setDictionary(_dictionary);
		setConversation(_conversation);
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

	public void loadConfigMenu() 
	{
		Scanner input = new Scanner(System.in);
		boolean config = true;
		do
		{
			System.out.println("** Welcome to " + getName() + "'s Config Menu **");
			System.out.println("1:  Print out the last conversation from the beginning");
			System.out.println("2:  Load words into the Dictionary, based on the current conversation");
			config = processMenuSelection(input.nextInt());
		}
		while(config == true);
	}

	private boolean processMenuSelection(int _selection) 
	{
		switch(_selection)
		{
		case 0:
		{
			return false;
		}
		case 1:
		{
			System.out.println(getConversation().toString());
			return true;
		}
		case 2:
		{
			updateDictionary();
		}
		default:
		{
			return true;
		}
		}
	}
	private void updateDictionary()
	{
		for(int count = 0; count < getConversation().getSentances().size(); count++)
		{
			//System.out.println(getConversation().getSentances().get(count));
			getDictionary().checkDictionary(getConversation().getSentances().get(count), getDictionary().getWords());
		}
	}

}
