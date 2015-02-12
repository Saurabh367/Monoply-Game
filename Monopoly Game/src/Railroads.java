import java.util.Scanner;

public class Railroads extends Squares{
	private String color;

	
	public Railroads(String n, String co, int c, int v, int o) {
		setName(n);
		color=co;
		setCost(c);
		setValue(v);
		setOwnerId(o);
		
	}
	

	public String getColor() {
		return color;
	}





	public void setColor(String color) {
		this.color = color;
	}





	public static void landedOnRailroad()
	{
		if(squares.get(MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getPosition()).getOwnerId()==0)
		{
		Scanner keyboard=new Scanner(System.in);
		System.out.println(MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getName() + " landed on " + squares.get(MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getPosition()).getName() + " and it costs " +  squares.get(MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getPosition()).getCost() + " dollars.");
		System.out.println("Would you like to buy it? 1)Yes 2)No");
		int awnser=keyboard.nextInt();
		if(awnser==1)
		{
			System.out.println(MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getName() + " you now own " +  squares.get(MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getPosition()).getName());
			squares.get(MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getPosition()).setOwnerId(MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getId());
			MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).setMoney(MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getMoney() - squares.get(MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getPosition()).getCost());
			System.out.println(MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getName() + " now has " + MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getMoney() + " dollars.");
		}
		else
		{
			System.out.println(MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getName() + " did not buy " + squares.get(MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getPosition()).getName() + " for " + squares.get(MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getPosition()).getCost() + " dollars.");
		}
		}
		else if(squares.get(MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getPosition()).getOwnerId()==MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getId())
		{
			System.out.println(MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getName() + " you already own " + squares.get(MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getPosition()).getName());
		}
		
		else
		{
			System.out.println(MonoplyStartGame.players.get(squares.get(MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getPosition()).getOwnerId()-1).getName() + " owns " + squares.get(MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getPosition()).getName() + " and you owe them " + squares.get(MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getPosition()).getValue() + " dollars.");
			MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).setMoney(MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getMoney() - squares.get(MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getPosition()).getValue());
			MonoplyStartGame.players.get( squares.get(MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getPosition()).getOwnerId()-1).setMoney(MonoplyStartGame.players.get( squares.get(MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getPosition()).getOwnerId()-1).getMoney() + squares.get(MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getPosition()).getValue());
			System.out.println(MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getName() + " now has " + MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getMoney() + " dollars.");
			System.out.println(MonoplyStartGame.players.get(squares.get(MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getPosition()).getOwnerId()-1).getName()  + " now has " + MonoplyStartGame.players.get(squares.get(MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getPosition()).getOwnerId()-1).getMoney() + " dollars.");
		}
		
		
	}
	

}
