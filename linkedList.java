package list;

import element.listElement;



public class linkedList
{
	private listElement head;
	private int length;
	
	public linkedList()
	{
		head = null;
		length = 0;
	}
	
	public void addElement(listElement le)
	{
		if (this.head == null)
		{
			head = le;
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
		
		length++;
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
		else if(index == 0)
		{
			//Case we want to delete head
			//Java does not require memory release and will clean up my garbage
			head = head.getNext();
			
			length--;
		}
		else
		{
			listElement beforeDelete = head;
			
			for (int i = 0; i < index - 1; i++)
			{
				beforeDelete = beforeDelete.getNext();
			}
			
			beforeDelete.setNext(beforeDelete.getNext().getNext());
			
			length--;
		}
		
		return true;
	}
	
	public void printList()
	{
		listElement toPrint = head;
		
		if (length == 0)
		{
			System.out.println("List is empty!");
		}
		else
		{
			for(int i = 0; i < length; i++)
			{
				System.out.println("Index" + i + ": " + toPrint.getData());
			}
		}
	}
}