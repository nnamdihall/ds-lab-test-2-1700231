//Created by: Nnamdi Hall
//ID#: 1700231
//Date:November 18,2019
public class Node {
	private Shirt data;
	private Node next;
	
    public Node() {
		super();
	}


	public Node (Shirt data)
	{
		super();
		this.data = data;
		
	}
	

	public Node(Shirt data, Node next) {
		super();
		this.data = data;
		this.next = next;
	}

	public Shirt getData() {
		return data;
	}

	public void setData(Shirt data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
	public void display()
	{
		
	}
	
	

}
