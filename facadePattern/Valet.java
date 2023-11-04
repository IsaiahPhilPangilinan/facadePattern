package facadePattern;

public class Valet implements HotelService{

    private String plateNumber;

    public Valet(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String pickUpVehicle(String plateNumber) {
        return "The valet has picked-up and parked your vehicle with the plate number: " + plateNumber + ".";
    }

    @Override
    public void executeService() {
        System.out.println(pickUpVehicle(plateNumber));
    }
}
