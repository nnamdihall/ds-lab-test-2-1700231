//Created by: Nnamdi Hall
//ID#: 1700231
//Date:November 18,2019
public class Shirt {
	private int id;
	private String colour;
	private float cost;
	
	public Shirt()
	{
		id=0;
		colour="";
		cost=0.0f;
	}
	public Shirt(int id, String colour, float cost) {
		super();
		this.id = id;
		this.colour = colour;
		this.cost = cost;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	
	public void display()
	{
		System.out.println("The shirt ID# is:");
		System.out.println("The shirt colour is:");
		System.out.println("The shirt cost is:");
		
	}
	
	

}
