package fixtures;

public interface RoomInfo
{
	public static final String[] roomName = {"foyer", "dining hall", "library", "bedroom"};
	public static final String[] shortDescription = {"Entrance foyer", "A grand dining hall", 
													"A large library", "A master bedroom"};
	public static final String[] longDescription = {"The entrance to the old house.",
													"The dining hall of the old house.",
													"The library of the old house.",
													"The master bedroom of the old house."};
	public static final String[][] itemsOfRoom = {{"Painting", "Telephone"},
												  {"Round Table", "Chairs"},
												  {"Books", "Bookcases"},
												  {"Bed", "Dresser"}};
	
	public default String giveRoomName(int index)
	{
		return roomName[index];
	}
	
	public default String giveRoomShortDescription(int index)
	{
		return shortDescription[index];
	}
	
	public default String giveRoomLongDescription(int index)
	{
		return longDescription[index];
	}
	
	public default String[] giveRoomItems(int index)
	{
		String[] rv = new String[2];
		
		for(int i = 0; i < 4; i++)
		{
			if(i == index)
			{
				for(int j = 0; j < 2; j++)
				{
					rv[j] = itemsOfRoom[index][j];
				}
			}
		}
		
		return rv;
		
	}
	
	public default int arrLength()
	{
		return roomName.length;
	}
}
