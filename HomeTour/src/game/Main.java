package game;

import java.util.Scanner;
import fixtures.Fixture;
import fixtures.Room;

public class Main
{
	
	public static Scanner myScanner = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		
	}
	
	private static void printRoom(Player player)
	{
		Room room = new Room();
		room = player.getCurrentRoom();
	}
	
	private static String[] collectInput()
	{
		return null;
	}
	
	private static void parse(String[] command, Player player)
	{
		
	}
}
