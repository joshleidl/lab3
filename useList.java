import linkedList;

import java.util.Scanner;

public class useList
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		
		String input = " ";
		int data;
		listElement toAdd;
		
		linkedList mainList = new linkedList();
		
		System.out.println("Welcome to the linked list program!");
		
		while(input.compareTo("5") == 0)
		{
			System.out.println("Please select one of the following options:");
			System.out.println("1: Add an element to the list");
			System.out.println("2: Retrieve a node from the list");
			System.out.println("3: Delete a node from the list");
			System.out.println("4: Print the whole list");
			System.out.println("5: Exit the program");
			
			input = in.getNext();
			
			switch(input.compareTo("0"))
			{
				case 1:
					System.out.print("Please enter the data to store: ");
					data = in.getNextInt();
					
					toAdd = new listElement();
					
					mainList.addElement()
			}
		}
	}
}