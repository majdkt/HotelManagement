import java.util.ArrayList;

public class Hotel {
    private String name  = null;
    private ArrayList<Room> rooms ;

    private boolean available = true;

    Hotel(String name)
    {
        this.name = name;
    }

    String getHotelName()
    {return name;}

    void cancel()
    {
        available = false;
    }
    boolean isAvailable()
    {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public Hotel(String name, ArrayList<Room> rooms , boolean available) {
        this.name = name;
        this.rooms=rooms;
        this.available = true;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public String toString() {
        return '{' + "name=" + name +
                ", rooms=" + rooms +
                ", available=" + available +
                '}';
    }


}
