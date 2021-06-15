package game;

import fixtures.Room;

public class Player
{
	private Room currentRoom;
	
	public Player()
	{
		this.currentRoom = null;
	}
	
	public Player(Room currentRoom)
	{
		this.currentRoom = currentRoom;
	}
	
	public void setCurrentRoom(Room currentRoom)
	{
		this.currentRoom = currentRoom;
	}
	
	public Room getCurrentRoom()
	{
		return this.currentRoom;
	}
}
