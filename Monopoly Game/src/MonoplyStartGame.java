import java.util.Scanner;
import java.util.ArrayList;

public class MonoplyStartGame {
	public static int currentPlayer = 0;
	public static ArrayList<Players> players = new ArrayList<Players>();

	public static void welcome() {
		System.out.println("Welcome to Monoply!" + "\n" + "\n"
				+ "Here are the rules:");
		System.out
				.println("1) The object of the game is to become the wealthiest player through buying, renting and selling of property.");
		System.out
				.println("2) The equipment consists of a board, 2 dice, tokens, 32 houses and 12 Hotels. There are 16 Chance and 16 Community Chest cards, 28 Title Deed card (one for each property), and play money.");
		System.out
				.println("3) If you own all types of a property then you have a monopoly.");
		System.out
				.println("4) Once you hava a monopoly the fee for landing on the property doubles and you can houses and then hotels.");
		System.out.println("5) You start out with 1500 dollars.");
		System.out
				.println("6) If you run out of money then you lose the game.");
		System.out
				.println("7) The player who still has money when knowone else does wins the game.");
	}

	public static void startGame(int d) {
		Scanner bob = new Scanner(System.in);

		System.out.println();
		System.out.println("How many players would like to play (2, 3, or 4)?");
		int lol = bob.nextInt();
		if (lol == 2) {
			System.out.println();
			System.out.println("What is player one's name?");
			String a = bob.next();
			players.add(new Players(0, 1, a, null, 1500));
			System.out.println();
			System.out.println("What is player two's name?");
			String b = bob.next();
			players.add(new Players(0, 2, b, null, 1500));
		} else if (lol == 3) {
			System.out.println();
			System.out.println("What is player one's name?");
			String c = bob.next();
			players.add(new Players(0, 1, c, null, 1500));
			System.out.println();
			System.out.println("What is player two's name?");
			String d = bob.next();
			players.add(new Players(0, 2, d, null, 1500));
			System.out.println();
			System.out.println("What is player three's name?");
			String e = bob.next();
			players.add(new Players(0, 3, e, null, 1500));
		} else if (lol == 4) {
			System.out.println();
			System.out.println("What is player one's name?");
			String f = bob.next();
			players.add(new Players(0, 1, f, null, 1500));
			System.out.println();
			System.out.println("What is player two's name?");
			String g = bob.next();
			players.add(new Players(0, 2, g, null, 1500));
			System.out.println();
			System.out.println("What is player three's name?");
			String h = bob.next();
			players.add(new Players(0, 3, h, null, 1500));
			System.out.println();
			System.out.println("What is player four's name?");
			String i = bob.next();
			players.add(new Players(0, 4, i, null, 1500));

		} else {
			System.out.println();
			System.out.print("That is not a valid input please try again.");
			System.exit(0);
		}
		if (lol == 2) {
			System.out.println();
			System.out
					.println("What character would you like to use "
							+ players.get(0).getName()
							+ " a 1)top hat, 2)thimble, 3)iron, 4)shoe, 5)battleship, or a 6)cannon?");
			int j = bob.nextInt();
			switch (j) {
			case 1:
				players.get(0).setToken("top hat");
				break;
			case 2:
				players.get(0).setToken("thimble");
				break;
			case 3:
				players.get(0).setToken("iron");
				break;
			case 4:
				players.get(0).setToken("shoe");
				break;
			case 5:
				players.get(0).setToken("battleship");
				break;
			case 6:
				players.get(0).setToken("cannon");
				break;
			}
			System.out.println();
			System.out.println(players.get(0).getName() + " your token is "
					+ players.get(0).getToken() + ".");
			System.out.println();
			System.out
					.println("What character would you like to use "
							+ players.get(1).getName()
							+ " a 1)top hat, 2)thimble, 3)iron, 4)shoe, 5)battleship, or a 6)cannon?");
			int k = bob.nextInt();
			switch (k) {
			case 1:
				players.get(1).setToken("top hat");
				break;
			case 2:
				players.get(1).setToken("thimble");
				break;
			case 3:
				players.get(1).setToken("iron");
				break;
			case 4:
				players.get(1).setToken("shoe");
				break;
			case 5:
				players.get(1).setToken("battleship");
				break;
			case 6:
				players.get(1).setToken("cannon");
				break;
			}
			System.out.println();
			System.out.println(players.get(1).getName() + " your token is "
					+ players.get(1).getToken() + ".");

		}
		if (lol == 3) {
			System.out.println();
			System.out
					.println("What character would you like to use "
							+ players.get(0).getName()
							+ " a 1)top hat, 2)thimble, 3)iron, 4)shoe, 5)battleship, or a 6)cannon?");
			int m = bob.nextInt();
			switch (m) {
			case 1:
				players.get(0).setToken("top hat");
				break;
			case 2:
				players.get(0).setToken("thimble");
				break;
			case 3:
				players.get(0).setToken("iron");
				break;
			case 4:
				players.get(0).setToken("shoe");
				break;
			case 5:
				players.get(0).setToken("battleship");
				break;
			case 6:
				players.get(0).setToken("cannon");
				break;
			}
			System.out.println();
			System.out.println(players.get(0).getName() + " your token is "
					+ players.get(0).getToken() + ".");
			System.out.println();
			System.out
					.println("What character would you like to use "
							+ players.get(1).getName()
							+ " a 1)top hat, 2)thimble, 3)iron, 4)shoe, 5)battleship, or a 6)cannon?");
			int n = bob.nextInt();
			switch (n) {
			case 1:
				players.get(1).setToken("top hat");
				break;
			case 2:
				players.get(1).setToken("thimble");
				break;
			case 3:
				players.get(1).setToken("iron");
				break;
			case 4:
				players.get(1).setToken("shoe");
				break;
			case 5:
				players.get(1).setToken("battleship");
				break;
			case 6:
				players.get(1).setToken("cannon");
				break;
			}
			System.out.println();
			System.out.println(players.get(1).getName() + " your token is "
					+ players.get(1).getToken() + ".");
			System.out.println();
			System.out
					.println("What character would you like to use "
							+ players.get(2).getName()
							+ " a 1)top hat, 2)thimble, 3)iron, 4)shoe, 5)battleship, or a 6)cannon?");
			int o = bob.nextInt();
			switch (o) {
			case 1:
				players.get(2).setToken("top hat");
				break;
			case 2:
				players.get(2).setToken("thimble");
				break;
			case 3:
				players.get(2).setToken("iron");
				break;
			case 4:
				players.get(2).setToken("shoe");
				break;
			case 5:
				players.get(2).setToken("battleship");
				break;
			case 6:
				players.get(2).setToken("cannon");
				break;
			}
			System.out.println();
			System.out.println(players.get(2).getName() + " your token is "
					+ players.get(2).getToken() + ".");

		}
		if (lol == 4) {
			System.out.println();
			System.out
					.println("What character would you like to use "
							+ players.get(0).getName()
							+ " a 1)top hat, 2)thimble, 3)iron, 4)shoe, 5)battleship, or a 6)cannon?");
			int p = bob.nextInt();
			switch (p) {
			case 1:
				players.get(0).setToken("top hat");
				break;
			case 2:
				players.get(0).setToken("thimble");
				break;
			case 3:
				players.get(0).setToken("iron");
				break;
			case 4:
				players.get(0).setToken("shoe");
				break;
			case 5:
				players.get(0).setToken("battleship");
				break;
			case 6:
				players.get(0).setToken("cannon");
				break;
			}
			System.out.println();
			System.out.println(players.get(0).getName() + " your token is "
					+ players.get(0).getToken() + ".");
			System.out.println();
			System.out
					.println("What character would you like to use "
							+ players.get(1).getName()
							+ " a 1)top hat, 2)thimble, 3)iron, 4)shoe, 5)battleship, or a 6)cannon?");
			int q = bob.nextInt();
			switch (q) {
			case 1:
				players.get(1).setToken("top hat");
				break;
			case 2:
				players.get(1).setToken("thimble");
				break;
			case 3:
				players.get(1).setToken("iron");
				break;
			case 4:
				players.get(1).setToken("shoe");
				break;
			case 5:
				players.get(1).setToken("battleship");
				break;
			case 6:
				players.get(1).setToken("cannon");
				break;
			}
			System.out.println();
			System.out.println(players.get(1).getName() + " your token is "
					+ players.get(1).getToken() + ".");
			System.out.println();
			System.out
					.println("What character would you like to use "
							+ players.get(2).getName()
							+ " a 1)top hat, 2)thimble, 3)iron, 4)shoe, 5)battleship, or a 6)cannon?");
			int r = bob.nextInt();
			switch (r) {
			case 1:
				players.get(2).setToken("top hat");
				break;
			case 2:
				players.get(2).setToken("thimble");
				break;
			case 3:
				players.get(2).setToken("iron");
				break;
			case 4:
				players.get(2).setToken("shoe");
				break;
			case 5:
				players.get(2).setToken("battleship");
				break;
			case 6:
				players.get(2).setToken("cannon");
				break;
			}
			System.out.println();
			System.out.println(players.get(2).getName() + " your token is "
					+ players.get(2).getToken() + ".");
			System.out.println();
			System.out
					.println("What character would you like to use "
							+ players.get(3).getName()
							+ " a 1)top hat, 2)thimble, 3)iron, 4)shoe, 5)battleship, or a 6)cannon?");
			int s = bob.nextInt();
			switch (s) {
			case 1:
				players.get(3).setToken("top hat");
				break;
			case 2:
				players.get(3).setToken("thimble");
				break;
			case 3:
				players.get(3).setToken("iron");
				break;
			case 4:
				players.get(3).setToken("shoe");
				break;
			case 5:
				players.get(3).setToken("battleship");
				break;
			case 6:
				players.get(3).setToken("cannon");
				break;
			}
			System.out.println();
			System.out.println(players.get(3).getName() + " your token is "
					+ players.get(3).getToken() + ".");

		}
		System.out.println();

		System.out.println("Game start!");
		int playerTotal = lol;
		while (playerTotal > 1) {
		int roll=Players.tossDie();
		System.out.println(players.get(currentPlayer).getName() + " rolled a " + roll);
		players.get(currentPlayer).setPosition(players.get(currentPlayer).getPosition() + roll);
		if(players.get(currentPlayer).getPosition()>39)
		{
			players.get(currentPlayer).setPosition(players.get(currentPlayer).getPosition()-39);
			PassingGo.passedGo();
		}
		
			
			switch (players.get(currentPlayer).getPosition()) {
			case 0:
				PassingGo.passedGo();
			case 1:
				Properties.landedOnProperty();
				break;
			case 2:
				CommunityChestAndChance.landedOnCommunityChest();
				break;
			case 3:
				Properties.landedOnProperty();
				break;
			case 4:
				TaxMoney.landedOnTax();
				break;
			case 5:
				Railroads.landedOnRailroad();
				break;
			case 6:
				Properties.landedOnProperty();
				break;
			case 7:
				CommunityChestAndChance.landedOnChance();
				break;
			case 8:
				Properties.landedOnProperty();
				break;
			case 9:
				Properties.landedOnProperty();
				break;
			case 10:
				Jail.landedOnJail();
				break;
			case 11:
				Properties.landedOnProperty();
				break;
			case 12:
				Utilities.landedOnUtility();
				break;
			case 13:
				Properties.landedOnProperty();
				break;
			case 14:
				Properties.landedOnProperty();
				break;
			case 15:
				Railroads.landedOnRailroad();
				break;
			case 16:
				Properties.landedOnProperty();
				break;
			case 17:
				CommunityChestAndChance.landedOnCommunityChest();
				break;
			case 18:
				Properties.landedOnProperty();
				break;
			case 19:
				Properties.landedOnProperty();
				break;
			case 20:
				FreeParking.landedOnFreeParking();
				break;
			case 21:
				Properties.landedOnProperty();
				break;
			case 22:
				CommunityChestAndChance.landedOnChance();
				break;
			case 23:
				Properties.landedOnProperty();
				break;
			case 24:
				Properties.landedOnProperty();
				break;
			case 25:
				Railroads.landedOnRailroad();
				break;
			case 26:
				Properties.landedOnProperty();
				break;
			case 27:
				Properties.landedOnProperty();
				break;
			case 28:
				Utilities.landedOnUtility();
				break;
			case 29: 
				Properties.landedOnProperty();
				break;
			case 30:
				GoToJail.landedOnGoToJail();
				break;
			case 31:
				Properties.landedOnProperty();
				break;
			case 32:
				Properties.landedOnProperty();
				break;
			case 33:
				CommunityChestAndChance.landedOnCommunityChest();
				break;
			case 34:
				Properties.landedOnProperty();
				break;
			case 35:
				Railroads.landedOnRailroad();
				break;
			case 36:
				CommunityChestAndChance.landedOnChance();
				break;
			case 37:
				Properties.landedOnProperty();
				break;
			case 38:
				TaxMoney.landedOnTax();
				break;
			case 39:
				Properties.landedOnProperty();
				break;
			
			}
			if(currentPlayer==playerTotal-1)
			{
				currentPlayer=0;
			}
			else
			{
				currentPlayer++;
			}
		}
	}
}
