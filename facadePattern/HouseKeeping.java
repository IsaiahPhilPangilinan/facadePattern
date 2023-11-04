package facadePattern;

public class HouseKeeping implements HotelService{

    private String roomNumber;

    public HouseKeeping(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String cleanRoom(String roomNumber) {
        return "The housekeeper has cleaned the room number: " + roomNumber + ".";
    }

    @Override
    public void executeService() {
        System.out.println(cleanRoom(roomNumber));
    }
}
