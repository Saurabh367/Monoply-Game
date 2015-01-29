import java.util.ArrayList;
public class Squares {
	private String name;
	private int cost;
	private int value;
	private int valuewithonehouse;
	private int valuewithtwohouses;
	private int valuewiththreehouses;
	private int valuewithfourhouses;
	private int valuewithhotel;
	private int costofhousesandhotels;
	private int mortagevalue;
	
	public Squares(String n, int co, int v, int v1, int v2, int v3, int v4, int h, int c, int m)
	{
		name=n;
		cost=co;
		value=v;
		valuewithonehouse=v1;
		valuewithtwohouses=v2;
		valuewiththreehouses=v3;
		valuewithfourhouses=v4;
        valuewithhotel=h;
        costofhousesandhotels=c;
        mortagevalue=m;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public int getValuewithonehouse() {
		return valuewithonehouse;
	}

	public void setValuewithonehouse(int valuewithonehouse) {
		this.valuewithonehouse = valuewithonehouse;
	}

	public int getValuewithtwohouses() {
		return valuewithtwohouses;
	}

	public void setValuewithtwohouses(int valuewithtwohouses) {
		this.valuewithtwohouses = valuewithtwohouses;
	}

	public int getValuewiththreehouses() {
		return valuewiththreehouses;
	}

	public void setValuewiththreehouses(int valuewiththreehouses) {
		this.valuewiththreehouses = valuewiththreehouses;
	}

	public int getValuewithfourhouses() {
		return valuewithfourhouses;
	}

	public void setValuewithfourhouses(int valuewithfourhouses) {
		this.valuewithfourhouses = valuewithfourhouses;
	}

	public int getValuewithhotel() {
		return valuewithhotel;
	}

	public void setValuewithhotel(int valuewithhotel) {
		this.valuewithhotel = valuewithhotel;
	}

	public int getCostofhousesandhotels() {
		return costofhousesandhotels;
	}

	public void setCostofhousesandhotels(int costofhousesandhotels) {
		this.costofhousesandhotels = costofhousesandhotels;
	}

	public int getMortagevalue() {
		return mortagevalue;
	}

	public void setMortagevalue(int mortagevalue) {
		this.mortagevalue = mortagevalue;
	}
	
	
	public void addProperties(){
		ArrayList<Squares> properties=new ArrayList<Squares>();
		properties.add(new Squares("Go", 0, 0, 0, 0, 0, 0, 0, 0, 0));
		properties.add(new Squares("Mediterranean Avenue", 60, 2, 10, 30, 90, 160, 250, 50, 30));
		properties.add(new Squares("Community Chest", 0, 0, 0, 0, 0, 0, 0, 0, 0));
		properties.add(new Squares("Baltic Avenue", 60, 4, 20, 60, 180, 320, 450, 50, 30));
		properties.add(new Squares("Income Tax", 200, 0, 0, 0, 0, 0, 0, 0, 0));
		properties.add(new Squares("Reading Railroad", 200, 25, 50, 100, 200, 0, 0, 0, 100));
		properties.add(new Squares("Oriental Avenue", 100, 6, 30, 90, 270, 400, 550, 50, 50));
		properties.add(new Squares("Chance", 0, 0, 0, 0, 0, 0, 0, 0, 0));
		properties.add(new Squares("Vermont Avenue", 100, 6, 30, 90, 200, 400, 550, 50, 50));
		properties.add(new Squares("Connecticut Avenue", 120, 8, 40, 100, 300, 450, 600, 50, 60));
		properties.add(new Squares("Jail", 0, 0, 0, 0, 0, 0, 0, 0, 0));
		properties.add(new Squares("St. James Place", 140, 10, 50, 150, 450, 625, 750, 100, 70));
		properties.add(new Squares("Electric Company", 0, 0, 0, 0, 0, 0, 0, 0, 0));
		properties.add(new Squares("States Avenue", 140, 10, 50, 150, 450, 625, 750, 100, 70));
		properties.add(new Squares("Virginia Avenue", 160, 12, 60, 180, 500, 700, 900, 100, 80));
		properties.add(new Squares("Pennsylvania Railroad", 200, 25, 50, 100, 200, 0, 0, 0, 100));
		properties.add(new Squares("St. James Place", 180, 14, 70, 200, 550, 750, 950, 100, 90));
		properties.add(new Squares("Community Chest", 0, 0, 0, 0, 0, 0, 0, 0, 0));
		properties.add(new Squares("Tennesseee Avenue", 180, 14, 70, 200, 550, 750, 950, 100, 90));
		properties.add(new Squares("Mediterranean Avenue", 0, 2, 10, 30, 90, 160, 250, 50, 30));
		properties.add(new Squares("Free Parking", 0, 0, 0, 0, 0, 0, 0, 0, 0));
		properties.add(new Squares("Kentucky Avenue", 220, 18, 90, 250, 700, 875, 1050, 150, 110));
		properties.add(new Squares("Chance", 0, 0, 0, 0, 0, 0, 0, 0, 0));
		properties.add(new Squares("Indiana Avenue", 220, 18, 90, 250, 700, 875, 1050, 150, 110));
		properties.add(new Squares("Illinois Avenue", 240, 20, 100, 300, 750, 925, 1100, 150, 120));
		properties.add(new Squares("B. & O. Railroad", 200, 25, 50, 100, 200, 0, 0, 0, 100));
		properties.add(new Squares("Atlantic Avenue", 260, 22, 110, 330, 800, 975, 1150, 150, 130));
		properties.add(new Squares("Ventnor Avenue", 260, 22, 110, 330, 800, 975, 1150, 150, 130));
		properties.add(new Squares("Water Works", 0, 0, 0, 0, 0, 0, 0, 0, 0));
		properties.add(new Squares("Marvin Gardens", 280, 24, 120, 360, 850, 1025, 1200, 150, 140));
		properties.add(new Squares("Go to Jail", 0, 0, 0, 0, 0, 0, 0, 0, 0));
		properties.add(new Squares("Pacfic Avenue", 300, 26, 130, 390, 900, 1100, 1275, 200, 150));
		properties.add(new Squares("North Carolina Avenue", 300, 26, 130, 390, 900, 1100, 1275, 200, 150));
		properties.add(new Squares("Community Chest", 0, 0, 0, 0, 0, 0, 0, 0, 0));
		properties.add(new Squares("Short Line", 200, 25, 50, 100, 200, 0, 0, 0, 100));
		properties.add(new Squares("Chance", 0, 0, 0, 0, 0, 0, 0, 0, 0));
		properties.add(new Squares("Park Place", 350, 35, 175, 500, 1100, 1300, 1500, 200, 175));
		properties.add(new Squares("Luxery Tax", 100, 0, 0, 0, 0, 0, 0, 0, 0));
		properties.add(new Squares("Boardwalk", 400, 50, 200, 600, 1400, 1700, 2000, 200, 200));
		
		
	}
	}
	

