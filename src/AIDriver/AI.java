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

	public AI(String _name, String _description, Dictionary _dictionary)
	{
		SetName(_name);
		SetDescription(_description); 
	}

	public String GetName()
	{
		return name;
	}

	private void SetName(String _name)
	{
		name = _name; 
	}

	public String GetDescription()
	{
		return description;
	}

	private void SetDescription(String _description)
	{
		description = _description;
	}

	public String toString()
	{
		String toString = ">> Name: " + GetName() + "\n>> Description: " + GetDescription();
		return toString;
	}
	
	public ArrayList<String> GetAttributes()
	{
		return attributes;
	}
	
	private void SetAttributes(ArrayList<String> _attributes)
	{
		attributes = _attributes;
	}
	
	private void SetDictionary()
	{
		
	}

}
