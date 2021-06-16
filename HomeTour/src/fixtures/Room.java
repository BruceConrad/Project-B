package fixtures;

public class Room extends Fixture
{
	private Room[] exits;
	/*
	 * exits[0] --> North
	 * exits[1] --> East
	 * exits[2] --> South
	 * exits[3] --> West
	 */
	
	public Room()
	{
		super();
		this.exits = new Room[1];
		exits[0] = null;
	}
	
	public Room(String name, String shortDescription, String longDescription, String[] items)
	{
		super(name, shortDescription, longDescription, items);
		this.exits = new Room[4];
		for(int i = 0; i < exits.length; i++)
		{
			exits[i] = null;
		}
	}
	
	public Room[] getExits()
	{
		return exits;
	}
	
	public Room getExit(String direction)
	{
		Room rv = new Room();
		
		switch(direction)
		{
			case "north":
			{
				rv = exits[0];
				break;
			}
			case "east":
			{
				rv = exits[1];
				break;
			}
			case "south":
			{
				rv = exits[2];
				break;
			}
			case "west":
			{
				rv = exits[3];
				break;
			}
		}
		
		return rv;
	}

	@Override
	public String toString()
	{
		String rv;
		
		rv = this.name + "\n" +
			 this.shortDescription + "\n" +
			 this.longDescription + "\n";
		if(items != null)
		{
			rv += "Items: \n";
			for(int i = 0; i < items.length; i++)
			{
				rv += items[i] + "\n";
			}
		}
		
		
		return rv;
	}
	
	
}
