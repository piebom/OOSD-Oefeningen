package DatumDomein;


public class Dagjaar {
	private int dagen;
	private final int[] aantdagen = {0,31,59,90,120,151,181,212,243,273,304,334,365};
	private final String[] Maanden = {"januari","februari","maart","april","mei","juni","juli","augustus","september","oktober","november","december"};
	
	
	public Dagjaar(int d, int m)
	{
		setDagen(aantdagen[m-1] + d);
	}
	public Dagjaar(int d, String m)
	{
		setDagen(aantdagen[java.util.Arrays.asList(Maanden).indexOf(m)] + d);
	}
	public void addDagen(int d)
	{
		dagen += d;
		if (dagen > 365)
		{
			dagen = dagen -365;
		}
	}
	public void setDagen(int dagen)
	{
		this.dagen = dagen;
	}
	public int getDagen()
	{
		return dagen;
	}
}
