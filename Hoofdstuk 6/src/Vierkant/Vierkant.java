package Vierkant;

public class Vierkant {

	private Punt linkerBovenHoek;
	private int zijde;

	public int getZijde() {
		return this.zijde;
	}

	public void setZijde(int value) {
		try {
			if(value > 0 && value < 501) {
				this.zijde = value;
			}
			else {
				throw new Exception("\nDe lengte van de zijde is niet tussen 1 en 500\n");
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

	public Vierkant(int x, int y, int zijde) {
		linkerBovenHoek = new Punt(x,y);
		setZijde(zijde);
	}

	public int geefOmtrek() {
		return zijde * 4;
	}

	public int geefOpp() {
		return zijde * zijde;
	}

	public void groei() {
		setZijde(zijde+5);
	}

	public void krimp() {
		setZijde(zijde-5);
	}

	public String toString() {
		return String.format("Het vierkant heeft: \nZijn linkerbovenhoek op: (%d, %d)\nEen zijde van: %d\nEen omtrek van: %d\nEenoppervlakte van: %d",linkerBovenHoek.getXCoord(),linkerBovenHoek.getYCoord(),zijde,geefOmtrek(),geefOpp());
	}
}
