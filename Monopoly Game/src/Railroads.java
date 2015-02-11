import java.util.Scanner;

public class Railroads extends Squares{
	private String color;
	private int cost;
	private int value;
	private int ownerId;
	
	public Railroads(String n, String co, int c, int v, int o) {
		super(n);
		color=co;
		cost=c;
		value=v;
		ownerId=o;
		
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

	public int getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}
	public static void landedOnRailroad()
	{
		if(((Railroads) squares.get(MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getPosition())).getOwnerId()==0)
		{
		Scanner keyboard=new Scanner(System.in);
		System.out.println(MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getName() + " landed on " + ((Squares) squares.get(MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getPosition())).getName() + " and it costs " + ((Railroads) squares.get(MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getPosition())).getCost() + " dollars.");
		System.out.println("Would you like to buy it? 1)Yes 2)No");
		int awnser=keyboard.nextInt();
		if(awnser==1)
		{
			System.out.println(MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getName() + " you now own " + ((Squares) squares.get(MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getPosition())).getName());
			((Railroads) squares.get(MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getPosition())).setOwnerId(MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getId());
			MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).setMoney(MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getMoney() - ((Railroads) squares.get(MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getPosition())).getCost());
			System.out.println(MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getName() + " now has " + MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getMoney() + " dollars.");
		}
		else
		{
			System.out.println(MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getName() + " did not buy " + ((Squares) squares.get(MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getPosition())).getName() + " for " + ((Railroads) squares.get(MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getPosition())).getCost() + " dollars.");
		}
		}
		else if(((Railroads) squares.get(MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getPosition())).getOwnerId()==MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getId())
		{
			System.out.println(MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getName() + " you already own " + squares.get(MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getPosition()).getName());
		}
		
		else
		{
			System.out.println(MonoplyStartGame.players.get(((Railroads) squares.get(MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getPosition())).getOwnerId()-1).getName() + " owns " + squares.get(MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getPosition()).getName() + " and you owe them " + ((Railroads) squares.get(MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getPosition())).getValue() + " dollars.");
			MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).setMoney(MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getMoney() - ((Railroads) squares.get(MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getPosition())).getValue());
			MonoplyStartGame.players.get(((Railroads) squares.get(MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getPosition())).getOwnerId()-1).setMoney(MonoplyStartGame.players.get(((Railroads) squares.get(MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getPosition())).getOwnerId()-1).getMoney() + ((Railroads) squares.get(MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getPosition())).getValue());
			System.out.println(MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getName() + " now has " + MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getMoney() + " dollars.");
			System.out.println(MonoplyStartGame.players.get(((Railroads) squares.get(MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getPosition())).getOwnerId()-1).getName()  + " now has " + MonoplyStartGame.players.get(((Railroads) squares.get(MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getPosition())).getOwnerId()-1).getMoney() + " dollars.");
		}
		
		
	}
	

}
