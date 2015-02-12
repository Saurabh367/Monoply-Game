
public class CommunityChestAndChance extends Squares{
	public CommunityChestAndChance(String n, int c, int v, int o) {
		setName(n);
		setCost(c);
		setValue(v);
		setOwnerId(o);
		
	}
	public static void landedOnCommunityChest()
	{
		System.out.println(MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getName() + " you landed on Community Chest.");
	}
	public static void landedOnChance()
	{
		System.out.println(MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getName() + " you landed on Chance.");
	}
	

}
