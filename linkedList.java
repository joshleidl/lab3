package linkedList;

public class linkedList
{
	private listElement head;
	private int length;
	
	public linkedList()
	{
		this.head = null;
		this.length = 0;
	}
	
	public void addElement(listElement le)
	{
		if (this.head == null)
		{
			this.head = le;
		}
		else
		{
			listElement addTo = new listElement();
			
			for (listElement iterator = head; iterator.getNext() != null; iterator = iterator.getNext())
			{
				addTo = iterator;
			}
			
			addTo.setNext(le);
		}
		
		this.length++;
	}
	
	public listElement getElement(int index)
	{
		if (index > length - 1 || index < 0)
		{
			return null;
		}
		else
		{
			listElement toReturn = head;
			
			for (int i = 0; i < index; i++)
			{
				toReturn = toReturn.getNext();
			}
			
			return toReturn;
		}
	}
	
	public boolean deleteElement(int index)
	{
		if (index > length - 1 || index < 0)
		{
			return false;
		}
		else
		{
			listElement toReturn = head;
			
			for (int i = 0; i < index; i++)
			{
				toReturn = toReturn.getNext();
			}
			
			return true;
		}
	}
	
	//public addElement()

}