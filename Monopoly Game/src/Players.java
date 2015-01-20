
public class Players {
	private String name;
	private int money;
	private String token;
	private String props;
	public Players(String n, int m, String t, String p)
	{
		n=name;
		m=money;
		p=props;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getProps() {
		return props;
	}
	public void setProps(String props) {
		this.props = props;
	}
	
	

}
