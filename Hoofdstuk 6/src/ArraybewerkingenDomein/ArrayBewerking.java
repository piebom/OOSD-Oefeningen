package ArraybewerkingenDomein;

public class ArrayBewerking {

	public static double[] deel(int[] rij1, int[] rij2) {
		double[] rij3 = new double[5];
		for (int x = 0; x < rij1.length;x++)
		{
			rij3[x] = (double)((double)rij1[x] / (double)rij2[x]);
		}
		return rij3;
	}

	public static void schuifOp(double[] rij, int aantalPlaatsen) {
        for(int i = 0; i < aantalPlaatsen; i++){    
            int j;
            double last;     
            last = rij[rij.length-1];    
            
            for(j = rij.length-1; j > 0; j--){    
            	rij[j] = rij[j-1];    
            }    
            rij[0] = last;    
        }    
	}

	public static String toon(double[] rij) {
		String output = "";
		for (int x = 0; x < rij.length;x++)
		{
			output += String.format("%10.2f", rij[x]);
		}
		return output;
	}

	public static String toon(int[] rij) {
		String output = "";
		for (int x = 0; x < rij.length;x++)
		{
			output += String.format("%10d", rij[x]);
		}
		return output;
	}
}
