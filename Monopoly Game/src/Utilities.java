import java.util.Scanner;

public class Utilities extends Squares{
	private String color;
	private int cost;
	private int value;
	private int ownerId;
	
	public Utilities(String n, String cl, int co, int v, int o)
	{
		super(n);
		color=cl;
		cost=co;
		value=v;
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
	public int getOwnerId() {
		return ownerId;
	}
	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}



	

    

    public static void landedOnUtility(){
    	Scanner choice = new Scanner(System.in);
    		if(((Utilities) squares.get(MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getPosition())).getOwnerId()==0)
    		{
    		System.out.println(MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getName() + " landed on " + ((Squares) squares.get(MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getPosition())).getName() + " and it costs " + ((Properties) squares.get(MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getPosition())).getCost() + ". /n Would you like to buy it? 1)Yes 2)No");
    		int userAwnser=choice.nextInt();
    		if(userAwnser==1)
    		{
    			System.out.println(MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getName() + " you now own " + ((Squares) squares.get(MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getPosition())).getName());
    			((Properties) squares.get(MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getPosition())).setOwnerId(MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getId());
    			MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).setMoney(MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getMoney() - ((Properties) squares.get(MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getPosition())).getCost());
    		}
    		else
    		{
    			System.out.println(MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getName() + " does not want to buy " + ((Squares) squares.get(MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getPosition())).getName() + ".");
    		}
    		
    		}
    	else
    	{
    		System.out.println("Im working on it.");
    	}
    }
    }

    	
