package AIDriver;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Dictionary 
{

	ArrayList<Word> words = new ArrayList<Word>();
	final File DICTIONARY = new File("Dictionary.txt"); 
	
	public Dictionary()
	{
		SetDictionary(DICTIONARY);
	}
	
	private void CheckFile()
	{
		if(!GetDictionary().exists())
		{
			try {
				GetDictionary().createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public ArrayList<Word> GetWords()
	{
		return words;
	}
	
	private ArrayList<Word> SetDictionary(File _dictionary)
	{
		ArrayList<Word> _words = new ArrayList<Word>();
		try {
			Scanner in = new Scanner(_dictionary);
			in.useDelimiter("#");
			while(in.hasNext())
			{
				_words.add(new Word(in.next(), in.next(), in.next()));
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return _words;
	}
	
	public File GetDictionary()
	{
		return DICTIONARY;
	}
	
//	private Word AddItemToDictionary()
//	{
//				
//	}
	
	private void CheckDictionary(String _word, ArrayList<Word> _wordlist)
	{
		_word = _word.replaceAll("(\\r|\\n)", "");
		for(int count = 0; count< _wordlist.size(); count++)
		{
			if(!_wordlist.get(count).word.equalsIgnoreCase(_word))
			{
				System.out.println("I am not famialier with that word. Could you please provide the following details:");
				System.out.println("Please tell me what type of word this is, from the list below:");
				for(int count1 = 0; count1 < Word.GetWordTypes().length; count++)
				{
					System.out.println(count1 + ": " + Word.GetWordTypes()[count1]);
				}
			}
		}
	}
	
	private void FindWordInDictionary()
	{
		
	}
}
