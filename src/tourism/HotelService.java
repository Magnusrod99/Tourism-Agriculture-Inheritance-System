// Author: Magnus Rodrigues
// Roll No: 2628
package tourism;

/**
 * Represents a hotel service. Demonstrates single inheritance by extending
 * TourismService.
 *
 * @author Magnus Rodrigues
 * @version 1.0
 */
public class HotelService extends TourismService {

    private int numberOfRooms;
    private double roomPrice;

    /**
     * Constructs a hotel service.
     *
     * @param serviceName name of the hotel
     * @param location hotel location
     * @param numberOfRooms available rooms
     * @param roomPrice price per room
     */
    public HotelService(String serviceName, String location,
            int numberOfRooms, double roomPrice) {

        super(serviceName, location);
        this.numberOfRooms = numberOfRooms;
        this.roomPrice = roomPrice;
    }

    /**
     * Displays hotel details.
     */
    public void displayHotelDetails() {
        displayService();

        System.out.println("Available Rooms: " + numberOfRooms);
        System.out.println("Room Price: Rs. " + roomPrice);
    }
}
