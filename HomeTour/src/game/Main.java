package game;

import java.util.Scanner;
import fixtures.Room;

public class Main
{
	
	public static Scanner myScanner = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		String[] test;
		String[] itemTest = {"Test Item"};
		Room testRoom = new Room("Tester", "This is a test variable",
				"This is to test the functions in main", itemTest);
		Player testPlayer = new Player(testRoom);
		printRoom(testPlayer);
		
		test = collectInput();
		parse(test, testPlayer);
	}
	
	private static void printRoom(Player player)
	{
		Room room = new Room();
		room = player.getCurrentRoom();
		
		System.out.println(room);
	}
	
	private static String[] collectInput()
	{
		String[] command;
		
		System.out.println("Enter the command you wish to perform: ");
		String input = myScanner.nextLine();
		
		command = input.split(" ");
		
		return command;
	}
	
	private static void parse(String[] command, Player player)
	{
		Room currRoom = new Room();
		currRoom = player.getCurrentRoom();
		String instruction = command[0].toLowerCase();
		
		switch(instruction)
		{
			case "go":
			{
				if(currRoom.getExit(command[1].toLowerCase()) != null)
				{
					player.setCurrentRoom(currRoom.getExit(command[1].toLowerCase()));
				}
				else
				{
					System.out.println("There is no exit that direction...");
				}
				break;
			}
			case "inspect":
			{
				//inspect item code here
				break;
			}
		}
	}
}
