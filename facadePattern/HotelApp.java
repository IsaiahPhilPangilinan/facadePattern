package facadePattern;
import java.util.Scanner;

public class HotelApp {

    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        FrontDesk frontDesk = new FrontDesk();
        int loop = 0;

        while (loop != 4) {
            System.out.println("Welcome to Hotel Management System App!");
            System.out.println("\tMAIN MENU\n" +
                    "\t1. Valet Service.\n" +
                    "\t2. Housekeeping Service.\n" +
                    "\t3. Request Luggage Cart(s).\n" +
                    "\t4. Exit.\n");
            System.out.print("Select a Hotel Service: ");
            int option = enter.nextInt();
            enter.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Enter the Plate Number of your vehicle: ");
                    String plateNumber = enter.nextLine();
                    enter.nextLine();
                    System.out.println();
                    HotelService valet = new Valet(plateNumber);
                    frontDesk.service(valet);
                    System.out.println();
                    break;

                case 2:
                    System.out.print("Enter your Room Number: ");
                    String roomNumber = enter.nextLine();
                    enter.nextLine();
                    System.out.println();
                    HotelService houseKeeping = new HouseKeeping(roomNumber);
                    frontDesk.service(houseKeeping);
                    System.out.println();
                    break;

                case 3:
                    System.out.print("Enter the number of cart(s): ");
                    int numberOfCarts = enter.nextInt();
                    enter.nextLine();
                    System.out.println();
                    HotelService cart = new Cart(numberOfCarts);
                    frontDesk.service(cart);
                    System.out.println();
                    break;

                case 4:
                    loop = option;
                    System.out.println("We hope you had a good time!");
                    System.out.println("Exiting app...\n");
                    break;

                default:
                    System.out.println("Invalid option...\n");
                    break;
            }
        }
    }

}
