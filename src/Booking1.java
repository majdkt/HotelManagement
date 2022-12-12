import java.util.Scanner;

public class Booking1 {
    static HotelList hotelDB = new HotelList();

    public static void main(String[] args) {
        String hotelName;
        Hotel hotel;
        Scanner inputID = new Scanner(System.in);

        while (true){
            System.out.println("Please choose the Hotel You want to book:\n"+getHotelList(hotelDB));
            while(true){
                System.out.println("Which hotel do you prefer?: ");
                hotelName = inputID.nextLine();
                if(hotelName.equals("x")){
                    break;
                }
                if(getHotel(hotelName) == null){

                    System.out.println("The Hotel name is incorrect, please enter again or enter x to quit");

                }
                else{

                    hotel = getHotel(hotelName);

                    if(hotel.isAvailable()){
                        System.out.println("Ok..");
                        RoomList rooms = new RoomList();
                        Booking.main(args);
                    }
                    else{
                        System.out.println("Not available");
                    }

                }

            }
        }


    }
    public static String getHotelList(HotelList hotelDB)
    {

        String hotelList = "";
        for(Hotel r:hotelDB.getHotels())
        {

            if(!r.isAvailable())
            {
                hotelList = hotelList+r.getHotelName()+" Booked out ";
            }
            else
            {
                hotelList = hotelList+r.getHotelName()+"(available)\n";
            }

        }
        return hotelList;
    }
    public static Hotel getHotel(String name){

        for(Hotel r:hotelDB.getHotels()){

            if(r.getName().equals(name)){
                System.out.println("Opening "+ name+"..");
                return r;
            }
        }
        return null;
    }

}
