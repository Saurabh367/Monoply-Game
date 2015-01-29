import java.util.Scanner;
import java.util.ArrayList;

public class MonoplyStartGame {
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

	public static void startGame() {
		Scanner bob = new Scanner(System.in);
		ArrayList<Players> players = new ArrayList<Players>();
		System.out.println();
		System.out.println("How many players would like to play (2, 3, or 4)?");
		int lol = bob.nextInt();
		if (lol == 2) {
			System.out.println();
			System.out.println("What is player one's name?");
			String a = bob.next();
			players.add(new Players(a, 1500, null, null));
			System.out.println();
			System.out.println("What is player two's name?");
			String b = bob.next();
			players.add(new Players(b, 1500, null, null));
		} else if(lol == 3) {
			System.out.println();
			System.out.println("What is player one's name?");
			String c = bob.next();
			players.add(new Players(c, 1500, null, null));
			System.out.println();
			System.out.println("What is player two's name?");
			String d = bob.next();
			players.add(new Players(d, 1500, null, null));
			System.out.println();
			System.out.println("What is player three's name?");
			String e = bob.next();
			players.add(new Players(e, 1500, null, null));
		} else if (lol == 4) {
			System.out.println();
			System.out.println("What is player one's name?");
			String f = bob.next();
			players.add(new Players(f, 1500, null, null));
			System.out.println();
			System.out.println("What is player two's name?");
			String g = bob.next();
			players.add(new Players(g, 1500, null, null));
			System.out.println();
			System.out.println("What is player three's name?");
			String h = bob.next();
			players.add(new Players(h, 1500, null, null));
			System.out.println();
			System.out.println("What is player four's name?");
			String i = bob.next();
			players.add(new Players(i, 1500, null, null));

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
							+ " a 1)top hat, 2)thimble, 3)iron, 4)shoe, 5)battleship, or a 6)cannon");
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
			System.out.println(players.get(0).getName() + " your token is "
					+ players.get(0).getToken());
			System.out.println();
			System.out
					.println("What character would you like to use "
							+ players.get(1).getName()
							+ " a 1)top hat, 2)thimble, 3)iron, 4)shoe, 5)battleship, or a 6)cannon");
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
			System.out.println(players.get(1).getName() + " your token is "
					+ players.get(1).getToken() + ".");

		}
		System.out.println();

		System.out.println("Game start!");

	}

}
