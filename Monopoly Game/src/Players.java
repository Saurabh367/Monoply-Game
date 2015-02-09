public class Players {
	int position;
	int id;
	String name;
	String token;
	int money;
	
	public Players(int p, int i, String n, String t, int m) {
		position=p;
		id = i;
		name = n;
		token=t;
		money=m;
	}
	

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	public static int tossDie() {
		Dice dice = new Dice();
		int playerRoll = dice.roll();
		return playerRoll;

	
	
	
	
}
}
	
	