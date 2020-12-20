package Oefeningen;


public class TestKlasse {
		
	    private static Patroon p;
	    static char[] tekens = {'A','B','C','D'};
	    public static void main(String[] args)
	    {
	    	for (char teken : tekens)
	    	{
		    	p = new Patroon(teken);
		    	System.out.printf("%s%n",p.teken());
	    	}
	    }
}
