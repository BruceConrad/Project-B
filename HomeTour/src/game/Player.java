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
	
	public void roomInfo()
	{
		System.out.println(this.currentRoom.getName() + "\n"
						   + this.currentRoom.getShortDescription() + "\n"
						   + this.currentRoom.getLongDescription());
	}
	
	public Room getCurrentRoom()
	{
		return this.currentRoom;
	}
	
	public void setCurrentRoom(Room currentRoom)
	{
		this.currentRoom = currentRoom;
	}
}
