package domein;

import java.security.SecureRandom;
import java.util.ArrayList;

public class Galgje {
	private ArrayList<String> reedsGeradenLetters;
	private int aantalMissers;
	private GeheimWoord gw;
	private SecureRandom random = new SecureRandom();
	private String[] woorden = {"test","aap","aardbei"}; 
	
	public Galgje()
	{
		gw = new GeheimWoord(woorden[random.nextInt(woorden.length-1)]);
		reedsGeradenLetters = new ArrayList<String>();
		aantalMissers = 0;
	}
	
	public void kiesLetter(String letter)
	{
		if(gw.getGezochtWoord().contains(letter) && reedsGeradenLetters.contains(letter) == false)
		{
			reedsGeradenLetters.add(letter);
		}
		else {
			aantalMissers++;
		}
	}
	
	public String getGemaskeerdWoord() {
		String gemaskeerdWoord = "";
		for(char letter : gw.getGezochtWoord().toCharArray())
		{
			if (reedsGeradenLetters.contains(String.valueOf(letter)))
			{
				gemaskeerdWoord = gemaskeerdWoord + letter;
			}
			else {
				gemaskeerdWoord = gemaskeerdWoord + "*";
			}
		}
		return gemaskeerdWoord;
	}
	public boolean isEindeSpel()
	{
		if (aantalMissers == 10)
		{
			return true;
		}
		else {
			int aantaljuist = 0;
			for (char letter : gw.getGezochtWoord().toCharArray())
			{
				if (reedsGeradenLetters.contains(String.valueOf(letter)))
				{
					aantaljuist++;
				}
			}
			if(aantaljuist == gw.getGezochtWoord().length())
			{
				return true;
			}
		}
		return false;
	}
	public int getScore()
	{
		if(aantalMissers == 10)
		{
			return 0;
		}
		else {
			int score = gw.getGezochtWoord().length() - aantalMissers;
			if(score < 0)
			{
				return 0;
			}
			else {
				return score;
			}
		}
	}
	public int getAantalMissers()
	{
		return aantalMissers;
	}
	public String getGeheimWoord() {
		return gw.getGezochtWoord();
	}
}
