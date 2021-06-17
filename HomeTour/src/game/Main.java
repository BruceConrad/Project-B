package game;

import java.util.Scanner;

import fixtures.Items;
import fixtures.Room;

public class Main
{
	static Scanner myScanner = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		RoomManager rm = new RoomManager();
		Items itemList = new Items();
		rm.init(itemList);
		Player player = new Player(rm.getStartingRoom(), itemList);
		player.roomInfo();
		
		String[] testCommand = collectInput();
		
		while(!testCommand[0].equals("quit"))
		{
			parse(testCommand, player, rm);
			testCommand = collectInput();
		}
	}
	
	public void printRoom(Player player)
	{
		player.roomInfo();
	}
	
	public static String[] collectInput()
	{
		String command;
		
		System.out.println("Enter the command:");
		command = myScanner.nextLine();
		
		String[] returnValue = command.toLowerCase().split(" ");
		
		return returnValue;
	}
	
	public static void parse(String[] command, Player player, RoomManager rm)
	{
		Room currentRoom = player.getCurrentRoom();
		Items currentItems = new Items();
		currentItems = player.getItemList();
		String itemToInspect = "";
		String item = "";
		switch(command[0])
		{
			case "go":
			{
				if(currentRoom.getExit(command[1]) != null)
				{
					player.setCurrentRoom(currentRoom.getExit(command[1]));
					player.roomInfo();
				}
				else
				{
					System.out.println("There is no exit that way...");
				}
				break;
			}
			case "shout":
			{
				System.out.println("You shout hello, nobody answers...");
				break;
			}
			case "inspect":
			{
				for(int i = 1; i < command.length; i++)
				{
					if(i > 1)
					{
						itemToInspect += " ";
					}
					itemToInspect += command[i];
				}
				item = currentItems.getItem(currentRoom, itemToInspect);
				if(item != null)
				{
					rm.itemDescription(item);
				}
				break;
			}
			case "quit":
			{
				System.out.println("Thanks for playing!");
				break;
			}
			default:
			{
				System.out.println("An invalid command has been entered, try again...");
				break;
			}
		}
	}
}
