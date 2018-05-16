package AIDriver;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Dictionary 
{

	ArrayList<Word> words = new ArrayList<Word>();
	final File DICTIONARY = new File("Dictionary.txt"); 

	public Dictionary()
	{
		checkFile();
		setDictionary(DICTIONARY);
	}

	private void checkFile()
	{
		if(!getDictionaryFile().exists())
		{
			try {
				System.out.println(getDictionaryFile().createNewFile());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public ArrayList<Word> getWords()
	{
		return words;
	}

	private ArrayList<Word> setDictionary(File _dictionary)
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

	public File getDictionaryFile()
	{
		return DICTIONARY;
	}

	//	private Word AddItemToDictionary()
	//	{
	//				
	//	}

	public ArrayList<Word> checkDictionary(Sentance _sentance, ArrayList<Word> _wordlist)
	{
		for(int count = 0; count < _sentance.getWords().size(); count++)
		{
			System.out.println(_sentance.getWords().get(count));
			String _word = _sentance.getWords().get(count);
			if(_wordlist.size() == 0)
			{
				System.out.println("1");
				_wordlist.add(addWordToDictionary(_word));
				break;
			}
			for(int count1 = 0; count1 < _wordlist.size(); count1++)
			{
				System.out.println("2");
				if(!_wordlist.get(count1).getWord().equalsIgnoreCase(_word))
				{
					System.out.println("3");
					_wordlist.add(addWordToDictionary(_word));
					break;
				}
			}

		}
		return _wordlist;
	}

	private Word addWordToDictionary(String _word) 
	{
		System.out.println("I am not famialier with the word '" + _word + "'. Could you please provide the following details:");
		Word newWord = new Word(_word, setWordType(), setDefinition(_word));
		writeWordToDictionaryFile(newWord);
		return newWord;
	}

	private void writeWordToDictionaryFile(Word newWord) 
	{
		checkFile();
		try 
		{
			FileWriter writer = new FileWriter(getDictionaryFile(), true);
			System.out.println(newWord.toString());
			writer.write(newWord.toString());

		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private String setDefinition(String _word) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Please provide a definition for the word " + _word);
		String _definition = input.nextLine();
		return _definition;
	}

	public String setWordType()
	{
		Scanner input = new Scanner(System.in);
		for(int count1 = 0; count1 < Word.getWordTypes().length; count1++)
		{
			System.out.println((count1+1) + ": " + Word.getWordTypes()[count1]);
		}
		System.out.print("Please tell me what type of word this is: ");
		String answer = Word.getWordTypes()[input.nextInt()];
		return answer;
	}

	private Word findWordInDictionary(String _string)
	{
		for(int count = 0; count < getWords().size(); count++)
		{
			if(_string.equalsIgnoreCase(getWords().get(count).getWord()))
			{
				Word _word = getWords().get(count);
				return _word;
			}
		}
		return null;
	} 


	@Override
	public String toString()
	{
		String toString = "\n>> Dictionary Location: " + getDictionaryFile().getAbsolutePath() + "\n>> My Dictionary is currently loaded with " + getWords().size() + " words";
		return toString;
	}
}
