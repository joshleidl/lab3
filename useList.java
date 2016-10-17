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
		
		int input;
		int data;
		listElement toAdd;
		
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
					
					toAdd = new listElement(data);
					
					mainList.addElement(toAdd);
					break;
				
				case 2:
			}
		}
	}
}