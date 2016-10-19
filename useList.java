import list.listElement;
import list.linkedList;

import java.util.*;
import java.util.Scanner;
import java.io.IOException;

public class useList
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		
		int input= 0;
		int data;
		listElement toAdd, grabbedElement;
		
		linkedList mainList = new linkedList();
		
		System.out.println("Welcome to the linked list program!");
		
		while(input != 5)
		{
			System.out.println("Please select one of the following options:");
			System.out.println("1: Add an element to the list");
			System.out.println("2: Retrieve a node from the list");
			System.out.println("3: Delete a node from the list");
			System.out.println("4: Print the whole list");
			System.out.println("5: Exit the program\n");
			
			System.out.print("Selection: ");
			input = in.nextInt();
			
			switch(input)
			{
				case 1:
					System.out.print("Please enter the data to store: ");
					data = in.nextInt();
					
					mainList.addElement(data);
					break;
				
				case 2:
					System.out.print("Please enter the index of the element (index starts at 0): ");
					input = in.nextInt();
					
					grabbedElement = mainList.getElement(input);
					
					if(grabbedElement == null)
						System.out.println("Invalid index!");
					else
						System.out.println("Value stored: " + grabbedElement.getData() + "\n");
					
					break;
					
				case 3:
					System.out.print("Please enter the index of the element (index starts at 0): ");
					input = in.nextInt();
					
					if(mainList.deleteElement(input))
						System.out.println("Success!\n");
					else
						System.out.println("Deletion failed\n");
					
					break;
					
				case 4:
					System.out.println("");
					
					mainList.printList();
					
					break;
				
				case 5:
					break;
					
				default:
					System.out.println("Invalid selection!");
			}
		}
	}
}