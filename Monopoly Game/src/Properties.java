import java.util.Scanner;
public class Properties extends Squares{
	private String color;
	private int cost;
	private int value;
	private int valuewithonehouse;
	private int valuewithtwohouses;
	private int valuewiththreehouses;
	private int valuewithfourhouses;
	private int valuewithhotel;
	private int costofhousesandhotels;
	private int ownerId;
	
	public Properties(String n, String cl, int co, int v, int v1, int v2, int v3, int v4, int h, int c, int o)
	{
		super(n);
		color=cl;
		cost=co;
		value=v;
		valuewithonehouse=v1;
		valuewithtwohouses=v2;
		valuewiththreehouses=v3;
		valuewithfourhouses=v4;
        valuewithhotel=h;
        costofhousesandhotels=c;
        ownerId=o;
  
	}


	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}



	public int getCost() {
		return cost;
	}



	public void setCost(int cost) {
		this.cost = cost;
	}



	public int getValue() {
		return value;
	}



	public void setValue(int value) {
		this.value = value;
	}



	public int getValuewithonehouse() {
		return valuewithonehouse;
	}



	public void setValuewithonehouse(int valuewithonehouse) {
		this.valuewithonehouse = valuewithonehouse;
	}



	public int getValuewithtwohouses() {
		return valuewithtwohouses;
	}



	public void setValuewithtwohouses(int valuewithtwohouses) {
		this.valuewithtwohouses = valuewithtwohouses;
	}



	public int getValuewiththreehouses() { 
		return valuewiththreehouses;
	}



	public void setValuewiththreehouses(int valuewiththreehouses) {
		this.valuewiththreehouses = valuewiththreehouses;
	}



	public int getValuewithfourhouses() {
		return valuewithfourhouses;
	}



	public void setValuewithfourhouses(int valuewithfourhouses) {
		this.valuewithfourhouses = valuewithfourhouses;
	}



	public int getValuewithhotel() {
		return valuewithhotel;
	}



	public void setValuewithhotel(int valuewithhotel) {
		this.valuewithhotel = valuewithhotel;
	}



	public int getCostofhousesandhotels() {
		return costofhousesandhotels;
	}



	public void setCostofhousesandhotels(int costofhousesandhotels) {
		this.costofhousesandhotels = costofhousesandhotels;
	}



	public int getOwnerId() {
		return ownerId;
	}



	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}
	
	
	public static void landedOnProperty()
	{
		Scanner choice=new Scanner(System.in);
		if(((Properties) squares.get(MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getPosition())).getOwnerId()==0)
		{
		System.out.println(MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getName() + " landed on " +  squares.get(MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getPosition()).getName() + " and it costs " + ((Properties) squares.get(MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getPosition())).getCost() + " dollars.");
		System.out.println("Would you like to buy it? 1)Yes 2)No");
		int userAwnser=choice.nextInt();
		if(userAwnser==1)
		{
			System.out.println(MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getName() + " you now own " + ((Squares) squares.get(MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getPosition())).getName());
			((Properties) squares.get(MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getPosition())).setOwnerId(MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getId());
			MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).setMoney(MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getMoney() - ((Properties) squares.get(MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getPosition())).getCost());
			System.out.println(MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getName() + " now has " + MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getMoney() + " dollars.");
		}
		else
		{
			System.out.println(MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getName() + " did not buy " + ((Squares) squares.get(MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getPosition())).getName() + " for " + ((Properties) squares.get(MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getPosition())).getCost() + " dollars.");
		}
		
		}
		
		else if(((Properties) squares.get(MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getPosition())).getOwnerId()==MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getId())
		{
			System.out.println(MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getName() + " you already own " + squares.get(MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getPosition()).getName());
		}
		
		else
		{
			System.out.println(MonoplyStartGame.players.get(((Properties) squares.get(MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getPosition())).getOwnerId()-1).getName() + " owns " + squares.get(MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getPosition()).getName() + " and you owe them " + ((Properties) squares.get(MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getPosition())).getValue() + " dollars.");
			MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).setMoney(MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getMoney() - ((Properties) squares.get(MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getPosition())).getValue());
			MonoplyStartGame.players.get(((Properties) squares.get(MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getPosition())).getOwnerId()-1).setMoney(MonoplyStartGame.players.get(((Properties) squares.get(MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getPosition())).getOwnerId()-1).getMoney() + ((Properties) squares.get(MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getPosition())).getValue());
			System.out.println(MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getName() + " now has " + MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getMoney() + " dollars.");
			System.out.println(MonoplyStartGame.players.get(((Properties) squares.get(MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getPosition())).getOwnerId()-1).getName()  + " now has " + MonoplyStartGame.players.get(((Properties) squares.get(MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getPosition())).getOwnerId()-1).getMoney() + " dollars.");
		}
		
	}

}
	
