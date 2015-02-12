
public class Jail extends Squares{
	public Jail(String n, int c, int v, int o)
	{
		setName(n);
		setCost(c);
		setValue(v);
		setOwnerId(o);
	}
	public static void landedOnJail()
	{
		System.out.println(MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getName() + " you are in jail and will pay 50 dollars to get out.");
		MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).setMoney(MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getMoney() - 50);
	}

}
