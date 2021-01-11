package cui;

import domein.Verplaatsing;
import domein.VerplaatsingPerAuto;
import domein.VerplaatsingPerBusTram;

public class VerplaatsingApplicatie {
    public void start()
    {
        Verplaatsing[] vpn = new Verplaatsing[4];

        vpn[0] = new VerplaatsingPerAuto("HoGent campus Schoonmeersen Gent",
                "EFFIX Waregem", 35.4, 1.32, 0.049);
        vpn[1] = new VerplaatsingPerAuto("HoGent campus Aalst",
                "Brenso NV Affligem", 11.9, 1.37, 0.058);
        vpn[2] = new VerplaatsingPerBusTram("HoGent campus Schoonmeersen Gent",
                "Technologiepark Zwijnaarde", 4.7, 70, true, true);
        vpn[3] = new VerplaatsingPerBusTram("Sint-Pietersstation Gent",
                "Vijfwindgatenstraat Gent", 3, 22, false, true);

        double kosten, totaleKosten = 0;
        for (Verplaatsing v : vpn)
        {
        	if(v instanceof VerplaatsingPerAuto)
        		kosten = ((VerplaatsingPerAuto)v).berekenPrijs();
        	else
        		kosten = ((VerplaatsingPerBusTram)v).berekenPrijs();
        	
            System.out.println(v);
            System.out.printf("Kosten voor deze verplaatsing: € %.2f%n", kosten);
            System.out.println();
            totaleKosten += kosten;
        }
       
        System.out.printf("Totale kosten voor alle verplaatsingen samen: € %.2f%n", totaleKosten);
    }
}
