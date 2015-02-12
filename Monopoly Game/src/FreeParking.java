
public class FreeParking extends Squares{
	public FreeParking(String n, int c, int v, int o) {
		setName(n);
		setCost(c);
		setValue(v);
		setOwnerId(o);
		
	}
	public static void landedOnFreeParking()
	{
		System.out.println(MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getName() + " you landed on Free Parking and collect 300 dollars.");
		MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).setMoney(MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getMoney() + 300);
	}

}
