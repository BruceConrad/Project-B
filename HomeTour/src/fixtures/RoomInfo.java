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
}
