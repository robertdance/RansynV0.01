package AIDriver;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AI 
{
	// Will want to rework these class variables somehow so that we can allow the AI to create additional variables for itself.
	private String name;
	private String description;

	public AI(String _name, String _description)
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



}
