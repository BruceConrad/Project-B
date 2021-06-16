package game;

import fixtures.Room;

public class RoomManager
{
	private Room startingRoom;
	private Room[] rooms;
	
	public RoomManager()
	{
		rooms = new Room[4];
	}
	
	public Room getStartingRoom()
	{
		return this.startingRoom;
	}
	
	public void setStartingRoom(Room startingRoom)
	{
		this.startingRoom = startingRoom;
	}
	
	public Room[] getRooms()
	{
		return this.rooms;
	}
	
	public void setRooms(Room[] rooms)
	{
		this.rooms = rooms;
	}
	
	public void init()
	{
		Room foyer = new Room("The Foyer",
							  "A small foyer",
							  "A large entryway into the mansion.");
		Room library = new Room("The Library",
								"A large library",
								"The mansion's library, holding an extensive" +
								" collection of novels.");
		Room diningHall = new Room("Dining Hall",
								   "A large dining hall",
								   "The dining hall has tables and chairs set out for" +
								   " what appears to be a large party.");
		Room ballRoom = new Room("Ball Room",
								 "A beautiful ball room",
								 "The ball room has a piano.");
		
		this.rooms[0] = foyer;
		this.rooms[1] = library;
		this.rooms[2] = diningHall;
		this.rooms[3] = ballRoom;
		this.startingRoom = foyer;
		
		Room[] foyerExits = {null, diningHall, null, library};
		Room[] libraryExits = {null, foyer, null, null};
		Room[] diningHallExits = {null, ballRoom, null, foyer};
		Room[] ballRoomExits = {null, null, null, diningHall};
		
		this.rooms[0].setExits(foyerExits);
		this.rooms[1].setExits(libraryExits);
		this.rooms[2].setExits(diningHallExits);
		this.rooms[3].setExits(ballRoomExits);
	}
}
