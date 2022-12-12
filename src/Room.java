class Room
{
    private String roomID  = null;
    private boolean booked = false;

    Room(String roomID)
    {
        this.roomID = roomID;
    }

    String getRoomID()
    {
        return roomID;
    }

    void cancel()
    {
        booked = false;
    }


    boolean isBooked()
    {
        return booked;
    }

    public void setBooked(boolean booked) {
        this.booked = booked;
    }
}