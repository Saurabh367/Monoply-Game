import java.util.ArrayList;
public class Squares {
	private String name;
	private String color;
	private int cost;
	private int value;
	private int valuewithonehouse;
	private int valuewithtwohouses;
	private int valuewiththreehouses;
	private int valuewithfourhouses;
	private int valuewithhotel;
	private int costofhousesandhotels;
	private int ownerId;
	
	public Squares(String n, String cl, int co, int v, int v1, int v2, int v3, int v4, int h, int c, int o)
	{
		name=n;
		color=cl;
		cost=co;
		value=v;
		valuewithonehouse=v1;
		valuewithtwohouses=v2;
		valuewiththreehouses=v3;
		valuewithfourhouses=v4;
        valuewithhotel=h;
        costofhousesandhotels=c;
        ownerId=o;
  
	}

	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}



	public int getCost() {
		return cost;
	}



	public void setCost(int cost) {
		this.cost = cost;
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



	public int getOwnerId() {
		return ownerId;
	}



	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}
	ArrayList<Squares> properties=new ArrayList<Squares>();



	public void addProperties(){
		
		properties.add(new Squares("Go", "none", 0, 0, 0, 0, 0, 0, 0, 0, 0));
		properties.add(new Squares("Mediterranean Avenue", "brown", 60, 2, 10, 30, 90, 160, 250, 50, 0));
		properties.add(new Squares("Community Chest", "obnio", 0, 0, 0, 0, 0, 0, 0, 0, 0));
		properties.add(new Squares("Baltic Avenue", "brown", 60, 4, 20, 60, 180, 320, 450, 50, 0));
		properties.add(new Squares("Income Tax", "ughu", 200, 0, 0, 0, 0, 0, 0, 0, 0));
		properties.add(new Squares("Reading Railroad", "black", 200, 25, 50, 100, 200, 0, 0, 0, 0));
		properties.add(new Squares("Oriental Avenue", "lblue", 100, 6, 30, 90, 270, 400, 550, 50, 0));
		properties.add(new Squares("Chance", "gfyg", 0, 0, 0, 0, 0, 0, 0, 0, 0));
		properties.add(new Squares("Vermont Avenue", "lblue", 100, 6, 30, 90, 200, 400, 550, 50, 0));
		properties.add(new Squares("Connecticut Avenue", "lblue", 120, 8, 40, 100, 300, 450, 600, 50, 0));
		properties.add(new Squares("Jail", "euhfby", 0, 0, 0, 0, 0, 0, 0, 0, 0));
		properties.add(new Squares("St. James Place", "purple", 140, 10, 50, 150, 450, 625, 750, 100, 0));
		properties.add(new Squares("Electric Company", "speacial", 0, 0, 0, 0, 0, 0, 0, 0, 0));
		properties.add(new Squares("States Avenue", "purple", 140, 10, 50, 150, 450, 625, 750, 100, 70));
		properties.add(new Squares("Virginia Avenue", "purple", 160, 12, 60, 180, 500, 700, 900, 100, 0));
		properties.add(new Squares("Pennsylvania Railroad", "black", 200, 25, 50, 100, 200, 0, 0, 0, 0));
		properties.add(new Squares("St. James Place", "orange", 180, 14, 70, 200, 550, 750, 950, 100, 0));
		properties.add(new Squares("Community Chest", "nuihghgu9", 0, 0, 0, 0, 0, 0, 0, 0, 0));
		properties.add(new Squares("Tennesseee Avenue", "orange", 180, 14, 70, 200, 550, 750, 950, 100, 0));
		properties.add(new Squares("New York Avenue", "orange", 200, 16, 80, 220, 600, 800, 1000, 100, 0));
		properties.add(new Squares("Free Parking", "gpojg0", 0, 0, 0, 0, 0, 0, 0, 0, 0));
		properties.add(new Squares("Kentucky Avenue", "red", 220, 18, 90, 250, 700, 875, 1050, 150, 0));
		properties.add(new Squares("Chance", "fdjngu9", 0, 0, 0, 0, 0, 0, 0, 0, 0));
		properties.add(new Squares("Indiana Avenue", "red", 220, 18, 90, 250, 700, 875, 1050, 150, 0));
		properties.add(new Squares("Illinois Avenue", "red", 240, 20, 100, 300, 750, 925, 1100, 150, 0));
		properties.add(new Squares("B. & O. Railroad", "black", 200, 25, 50, 100, 200, 0, 0, 0, 0));
		properties.add(new Squares("Atlantic Avenue", "yellow", 260, 22, 110, 330, 800, 975, 1150, 150, 0));
		properties.add(new Squares("Ventnor Avenue", "yellow", 260, 22, 110, 330, 800, 975, 1150, 150, 0));
		properties.add(new Squares("Water Works", "nuetral", 0, 0, 0, 0, 0, 0, 0, 0, 0));
		properties.add(new Squares("Marvin Gardens", "yellow", 280, 24, 120, 360, 850, 1025, 1200, 150, 0));
		properties.add(new Squares("Go to Jail", "ngfiuhfu", 0, 0, 0, 0, 0, 0, 0, 0, 0));
		properties.add(new Squares("Pacfic Avenue", "green", 300, 26, 130, 390, 900, 1100, 1275, 200, 0));
		properties.add(new Squares("North Carolina Avenue", "green", 300, 26, 130, 390, 900, 1100, 1275, 200, 0));
		properties.add(new Squares("Community Chest", "ereguyrtfbf", 0, 0, 0, 0, 0, 0, 0, 0, 0));
		properties.add(new Squares("Short Line", "black", 200, 25, 50, 100, 200, 0, 0, 0, 0));
		properties.add(new Squares("Chance", "fjhu8ghu", 0, 0, 0, 0, 0, 0, 0, 0, 0));
		properties.add(new Squares("Park Place", "dblue", 350, 35, 175, 500, 1100, 1300, 1500, 200, 0));
		properties.add(new Squares("Luxery Tax", "jhgfu8gfu", 100, 0, 0, 0, 0, 0, 0, 0, 0));
		properties.add(new Squares("Boardwalk", "dblue", 400, 50, 200, 600, 1400, 1700, 2000, 200, 0));
		
		
	}
	}