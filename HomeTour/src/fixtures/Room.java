package fixtures;

public class Room extends Fixture
{
	private Room[] exits;
	private static final int EXIT_AMOUNT = 4;
	/*
	 * exits[0] --> North
	 * exits[1] --> East
	 * exits[2] --> South
	 * exits[3] --> West
	 */
	
	public Room()
	{
		super();
		this.exits = null;
	}
	
	public Room(String name, String shortDescription, String longDescription)
	{
		super(name, shortDescription, longDescription);
		this.exits = new Room[EXIT_AMOUNT];
		for(int i = 0; i < EXIT_AMOUNT; i++)
		{
			exits[i] = null;
		}
	}

	public String getName()
	{
		return this.name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getShortDescription()
	{
		return this.shortDescription;
	}

	public void setShortDescription(String shortDescription)
	{
		this.shortDescription = shortDescription;
	}

	public String getLongDescription()
	{
		return this.longDescription;
	}

	public void setLongDescription(String longDescription)
	{
		this.longDescription = longDescription;
	}
	
	public void setExits(Room[] exits)
	{
		this.exits = exits;
	}
	
	public Room[] getExits()
	{
		return this.exits;
	}
	
	public Room getExit(String direction)
	{
		Room returnValue = new Room();
		switch(direction)
		{
			case "north":
				returnValue = exits[0];
				break;
			case "east":
				returnValue = exits[1];
				break;
			case "south":
				returnValue = exits[2];
				break;
			case "west":
				returnValue = exits[3];
				break;
		}
		return returnValue;
	}
	
}
