
public class TaxMoney extends Squares{
	public TaxMoney(String n, int o) {
		setName(n);
		setOwnerId(o);
		
	}
	public static void landedOnTax()
	{
		if(MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getPosition()==4)
		{
			System.out.println("You landed on Income Tax and lose 200 dollars.");
			MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).setMoney(MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getMoney() - 200);
		}
		
		else
		{
			System.out.println("You landed on Luxury Tax and lose 100 dollars.");
		MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).setMoney(MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getMoney() - 100);
		}
	}

}
