package fixtures;

import java.util.Hashtable;

public class Items
{
	private Hashtable<Room, String[]> roomItems;
	private String[] foyerObjects = {"window", "chandalier", "rugs", "a small crown"};
	private String[] libraryObjects = {"bookcases", "piles of books", null, null};
	private String[] diningHallObjects = {"round table", "chairs", "window", null};
	private String[] ballRoomObjects = {"piano", null, null, null};
	
	public Items()
	{
		this.roomItems = new Hashtable<Room, String[]>();
	}
	
	public Items(Hashtable<Room, String[]> roomItems)
	{
		this.roomItems = roomItems;
	}
	
	public String[] getRoomItems(Room roomName)
	{
		String[] returnValue =  roomItems.get(roomName);
		
		return returnValue;
	}
	
	public String getItem(Room roomName, String item)
	{
		String rv = null;
		String[] itemList = getRoomItems(roomName);
		
		for(int i = 0; i < itemList.length; i++)
		{
			if(item.equals(itemList[i]))
			{
				rv = item;
			}
		}
		
		if(rv == null)
		{
			System.out.println("Item does not exist here");
		}
		
		return rv;
	}
	
	public void InitItems(Room[] roomList)
	{
		for(int i = 0; i < roomList.length; i++)
		{
			if(roomList[i].getName().equals("The Foyer"))
			{
				this.roomItems.put(roomList[i], this.foyerObjects);
			}
			else if(roomList[i].getName().equals("The Library"))
			{
				this.roomItems.put(roomList[i], this.libraryObjects);
			}
			else if(roomList[i].getName().equals("Dining Hall"))
			{
				this.roomItems.put(roomList[i], this.diningHallObjects);
			}
			else if(roomList[i].getName().equals("Ball Room"))
			{
				this.roomItems.put(roomList[i], this.ballRoomObjects);
			}
		}
	}
	
	public void displayItems(Room room)
	{
		String[] items = roomItems.get(room);
		
		System.out.println("Items:");
		
		for(int i = 0; i < items.length; i++)
		{
			if(items[i] != null)
			{
				System.out.println(items[i]);
			}
		}
	}
	
}
