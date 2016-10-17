package list;

public class listElement
{
	private int data;
	private listElement next;
	
	public listElement()
	{
		this.data = 0;
		this.next = null;
	}
	
	public listElement(int d)
	{
		this.data = d;
		this.next = null;
	}
	
	public int getData()
	{
		return this.data;
	}
	
	public void setNext(listElement le)
	{
		this.next = le;
	}
	
	public listElement getNext()
	{
		return this.next;
	}
}

