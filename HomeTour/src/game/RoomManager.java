package game;

import fixtures.Room;
import fixtures.RoomInfo;

public class RoomManager implements RoomInfo
{
	private RoomInfo roomLibrary;
	private Room startingRoom;
	private Room[] rooms;
	
	public RoomManager()
	{
		this.startingRoom = null;
		this.rooms = new Room[1];
		this.rooms[0] = null;
	}
	
	public RoomManager(Room startingRoom, Room[] rooms)
	{
		this.startingRoom = startingRoom;
		this.rooms = rooms;
	}
	
	
	
	public Room getStartingRoom() {
		return startingRoom;
	}

	public void setStartingRoom(Room startingRoom) {
		this.startingRoom = startingRoom;
	}

	public Room[] getRooms() {
		return rooms;
	}

	public void setRooms(Room[] rooms) {
		this.rooms = rooms;
	}

	public void init()
	{
		for(int i = 0; i < roomLibrary.arrLength(); i++)
		{
			String roomName = roomLibrary.giveRoomName(i);
			String roomShortDes = roomLibrary.giveRoomShortDescription(i);
			String roomLongDes = roomLibrary.giveRoomLongDescription(i);
			String[] items = roomLibrary.giveRoomItems(i);
			Room newRoom = new Room(roomName, roomShortDes, roomLongDes, items);
			this.rooms[i] = newRoom;
		}
	}
	
	
}
