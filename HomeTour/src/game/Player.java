package game;

import fixtures.Room;
import fixtures.Items;

public class Player
{
	private Room currentRoom;
	private Items itemList;
	
	public Player()
	{
		this.currentRoom = null;
		this.itemList = null;
	}
	
	public Player(Room currentRoom, Items itemList)
	{
		this.currentRoom = currentRoom;
		this.itemList = itemList;
	}
	
	public void roomInfo()
	{
		System.out.println(this.currentRoom.getName() + "\n"
						   + this.currentRoom.getShortDescription() + "\n"
						   + this.currentRoom.getLongDescription() + "\n");
		this.itemList.displayItems(this.currentRoom);
		System.out.println("\n");
	}
	
	public Room getCurrentRoom()
	{
		return this.currentRoom;
	}
	
	public void setCurrentRoom(Room currentRoom)
	{
		this.currentRoom = currentRoom;
	}
	
	public Items getItemList()
	{
		return this.itemList;
	}
	
	public void setItemList(Items itemList)
	{
		this.itemList = itemList;
	}
}
