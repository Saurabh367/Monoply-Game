
public class GoToJail extends Squares{
	public GoToJail(String n, int o) {
		setName(n);
		setOwnerId(o);
		
	}
	public static void landedOnGoToJail()
	{
		System.out.println(MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getName() + " landed on the Go to Jail square and will now be going to Jail.");
		MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).setPosition(10);
	}

}
