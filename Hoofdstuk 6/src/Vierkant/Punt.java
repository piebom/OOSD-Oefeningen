package Vierkant;

public class Punt {

	private int xCoord;
	private int yCoord;

	public int getXCoord() {
		return this.xCoord;
	}

	public void setXCoord(int value) {
		try {
			controleerCoord('x',value);
			this.xCoord = value;
		}
		catch (Exception e){
			System.out.println(e.getMessage());
		}
	}

	public int getYCoord() {
		return this.yCoord;
	}

	public void setYCoord(int value) {
		try {
			controleerCoord('y',value);
			this.yCoord = value;
		}
		catch (Exception e){
			System.out.println(e.getMessage());
		}
	}

	public Punt() {
		xCoord = 1;
		yCoord = 1;
	}

	public Punt(int xCoord, int yCoord) {
		this.xCoord = xCoord;
		this.yCoord = yCoord;
	}

	public String toString() {
		return String.format("(%d,%d)", xCoord,yCoord);
	}

	private void controleerCoord(char xOfy, int coord) throws Exception {
		if(coord <= 0)
		{
			throw new Exception(String.format("Het %s coordinaat is niet groter dan 0", xOfy));
		}
	}
}
