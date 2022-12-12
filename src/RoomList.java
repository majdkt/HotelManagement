import java.util.ArrayList;

class RoomList
{
    private ArrayList<Room> rooms;
    private String[] roomID = {"Room1","Room2"};

    RoomList(){

        rooms = new ArrayList<Room>();
        for(int i=0;i<roomID.length;i++)
        {
            addRoom(new Room(roomID[i]));
        }

    }

    public void addRoom(Room addRoom){
        rooms.add(addRoom);
    }

    public ArrayList<Room> getRooms(){
        return rooms;
    }
}