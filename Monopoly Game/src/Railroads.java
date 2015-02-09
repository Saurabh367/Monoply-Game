
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
		System.out.println(MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getName() + " landed on " + ((Squares) squares.get(MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getPosition())).getName() + " and it costs " + ((Railroads) squares.get(MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getPosition())).getCost() + "? 1)Yes 2)No");
		
	}
	

}
