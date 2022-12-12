import java.util.Scanner;

public class Booking {

    static RoomList roomDB = new RoomList();

    public static void main(String[] args) {
        String roomID;
        Room room;
        Scanner inputID = new Scanner(System.in);

        while(true){

            System.out.println("Please choose the room you want to book \n"+getRoomList(roomDB));

            while(true){
                roomID = inputID.nextLine();
                if(roomID.equals("x")){
                    Booking1.main(args);
                } else if (roomID.equals("show")) {
                    Console.show();
                    }

                if(getRoom(roomID) == null){

                    System.out.println("The room ID is incorrect, please enter again or enter x to quit");

                }
                else{

                    room = getRoom(roomID);

                    if(!room.isBooked()){
                        Console.addNew();
                        System.out.println("Booked successfully");
                        System.out.println("---------------------");
                        room.setBooked(true);
                        break;
                    }
                    else{
                        System.out.println("please enter the room name again or enter x to quit");
                    }

                }

            }

        }

    }
    public static String getRoomList(RoomList roomDB)
    {

        String roomList = "";
        for(Room r:roomDB.getRooms())
        {

            if(!r.isBooked())
            {
                roomList = roomList+r.getRoomID()+" (FREE) "+"   ";
            }
            else
            {
                roomList = roomList+r.getRoomID()+" (BOOKED) ";
            }

        }
        return roomList;
    }


    public static Room getRoom(String roomID){

        for(Room r:roomDB.getRooms()){

            if(r.getRoomID().equals(roomID)){
                return r;
            }

        }
        return null;

    }

}