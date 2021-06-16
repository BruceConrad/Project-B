package game;

import java.util.Scanner;
import fixtures.Room;

public class Main
{
	static Scanner myScanner = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		Player testPlayer = new Player();
		RoomManager rm = new RoomManager();
		rm.init();
		testPlayer.setCurrentRoom(rm.getStartingRoom());
		testPlayer.roomInfo();
		
		String[] testCommand = collectInput();
		
		while(testCommand[0] != "quit")
		{
			parse(testCommand, testPlayer);
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
	
	public static void parse(String[] command, Player player)
	{
		Room currentRoom = player.getCurrentRoom();
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
