public class Players {
	int position = 0;
	int id;
	String name;
	String token;
	Money money = new Money(1500);
	
	public Players(int p, int i, String n, String t) {
		position=p;
		id = i;
		name = n;
		token=t;
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

	public Money getMoney() {
		return money;
	}

	public void setMoney(Money money) {
		this.money = money;
	}
	
	
}
	
	