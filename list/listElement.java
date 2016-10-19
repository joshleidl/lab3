package list;

public class listElement
{
	private int data;
	private listElement next;
	private listElement prev;
	
	public listElement()
	{
		this.data = 0;
		this.next = null;
		this.prev = null;
	}
	
	public void copy(listElement copyFrom)
	{
		this.data = copyFrom.getData();
		this.next = copyFrom.getNext();
		this.prev = copyFrom.getPrev();
	}
	
	public listElement(int d)
	{
		this.data = d;
		this.next = null;
		this.prev = null;
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
	
	public void setPrev(listElement le)
	{
		this.prev = le;
	}
	
	public listElement getPrev()
	{
		return this.prev;
	}
}

