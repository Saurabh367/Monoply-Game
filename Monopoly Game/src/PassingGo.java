
public class PassingGo extends Squares{

	public PassingGo(String n, int o) {
		setName(n);
		setOwnerId(o);
		
	}
	public static void passedGo()
	{
		System.out.println(MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getName() + " you passed Go and collect 200 dollars.");
		MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).setMoney(MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getMoney() + 200);
		
	}
}