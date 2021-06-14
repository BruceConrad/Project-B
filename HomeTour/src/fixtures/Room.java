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
	
	public Room(String name, String shortDescription, String longDescription)
	{
		super(name, shortDescription, longDescription);
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
			case "North":
			{
				rv = exits[0];
				break;
			}
			case "East":
			{
				rv = exits[1];
				break;
			}
			case "South":
			{
				rv = exits[2];
				break;
			}
			case "West":
			{
				rv = exits[3];
				break;
			}
		}
		
		return rv;
	}
}
