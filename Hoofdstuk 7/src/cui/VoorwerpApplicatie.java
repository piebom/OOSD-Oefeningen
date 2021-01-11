package cui;

import domein.Sleutel;
import domein.Voorwerp;
import domein.Wapen;

public class VoorwerpApplicatie {

    public void start()
    {
        Voorwerp w[] = new Voorwerp[4];
        
        w[0] = new Wapen("colt", 1.5, 3, 6, false); 
        w[1] = new Wapen("brown", 0.5, 1, 23, true);
        
        w[2] = new Sleutel("voordeur", 0.5, 3, 1);
        w[3] = new Sleutel("achterdeur", 0.5, 1, 2);
        
        for (Voorwerp vwp : w)
            System.out.println(vwp);
    }

}
