package DatumDomein;

import java.util.Arrays;

public class DatumControle {
	private final int[] aantdagen = {0,31,28,31,30,31,30,31,30,31,30,31,30,31};
	private final String[] Maanden = {"januari","februari","maart","april","mei","juni","juli","augustus","september","oktober","november","december"};
	
	public boolean controleerDatumDDMM(int datum) {
		String d = String.valueOf(datum);
		if (d.length() == 3)
		{
			d = "0" + d;
		}
			if(Integer.valueOf(d.substring(2)) < 13 && Integer.valueOf(d.substring(2)) > 0)
					{
				int aantaldagen = aantdagen[Integer.valueOf(d.substring(2))];
				if(Integer.valueOf(d.substring(0,2)) <= aantaldagen && Integer.valueOf(d.substring(0,2)) >0)
				{
					return true;
				}
			}
		return false;
		}
	public boolean controleerDatumDDMM(int d, String m)
	{
		try {
			if(Arrays.asList(Maanden).indexOf(m) + 1 < 13 && java.util.Arrays.asList(Maanden).indexOf(m) + 1 > 0)
			{
		int aantaldagen = aantdagen[Arrays.asList(Maanden).indexOf(m) + 1];
		if(d <= aantaldagen && d >0)
		{
			return true;
		}
			}
		}
	catch(Exception e)
	{
		return false;
	}
		return false;
	}
}
