package Oefeningen;

public class Patroon {
	char type;
	char opvulteken;
	
	public Patroon(char type)
	{
		setType(type);
		this.opvulteken = '*';
	}
	
	public Patroon(char type, char opvulteken) {
		setType(type);
		setOpvulteken(opvulteken);
	}
	
	private void setOpvulteken(char opvulteken)
	{
		if(opvulteken == '*' || opvulteken == '+' || opvulteken == '-' || opvulteken == '!' || opvulteken == '?')
		{
			this.opvulteken = opvulteken;	
		}
		else {
			this.opvulteken = '*';
		}
	}
	
	private void setType(char type)
	{
		if(type == 'A' || type == 'B' || type == 'C' || type == 'D')
		{
			this.type = type;	
		}
		else {
			this.type = 'A';
		}
	}
	
	public String teken()
	{
		String output = "";
		switch(type){
		case 'A':
			output = tekenPatroonA();
			break;
			
		case 'B':
			output = tekenPatroonB();
			break;
			
		case 'C':
			output = tekenPatroonC();
			break;
			
		case 'D':
			output = tekenPatroonD();
			break;
			
		}
		return output;
	}
	private String tekenPatroonA() {
		String output = "Patroon A\n";
		for (int i = 0; i<11;i++)
		{
			for(int a = -1; a<i;a++)
			{
				output += opvulteken;
			}
			output +="\n";
		}
		return output;
	}
	
	private String tekenPatroonB() {
		String output = "Patroon B\n";
		for (int i = 0; i<10;i++)
		{
			for(int b = 0;b<10-(10-i);b++)
			{
				output += " ";
			}
			for(int a = 0;a<9-i;a++)
			{
				output += opvulteken;	
			}
			output +="\n";
		}
		return output;
	}
	
	private String tekenPatroonC() {
		String output = "Patroon C\n";
		for (int i = 0; i<10;i++)
		{
			for(int a = 0;a<10-i;a++)
			{
				output += opvulteken;	
			}
			output +="\n";
		}
		return output;
	}
	
	private String tekenPatroonD() {
		String output = "Patroon D\n";
		for (int i = 0; i<10;i++)
		{
			for(int b = 0;b<9-i;b++)
			{
				output += " ";
			}
			for(int a = 0;a<10-(9-i);a++)
			{
				output += opvulteken;	
			}
			output +="\n";
		}
		return output;
	}
}
