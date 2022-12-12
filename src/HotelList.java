import java.util.ArrayList;
import java.util.Random;

class HotelList
{
    private ArrayList<Hotel> hotels;
    private String[] hotelID = {"Hotel1","Hotel2","Hotel3","Hotel4"};

    HotelList(){

        hotels = new ArrayList<Hotel>();
        for(int i=0;i<hotelID.length;i++)
        {
            addHotel(new Hotel(hotelID[i]));
        }

    }

    public void addHotel(Hotel addHotel){
        hotels.add(addHotel);
    }

    public ArrayList<Hotel> getHotels(){
        return hotels;
    }
}