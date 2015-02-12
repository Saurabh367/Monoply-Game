
public class MonopolyRunner {

	public static void main(String[] args) {
		Squares.addProperties();
		WelcomeGraphic.letsGo();
		MonoplyStartGame.welcome();
	    int total=Dice.roll();
		MonoplyStartGame.startGame(total);

	}

}
