// Author: Magnus Rodrigues
// Roll No: 2628
package tourism;

/**
 * Represents a travel agency. Demonstrates hierarchical inheritance by
 * extending TourismService.
 *
 * @author Magnus Rodrigues
 * @version 1.0
 */
public class TravelAgency extends TourismService {

    private int numberOfPackages;
    private String vehicleType;

    /**
     * Constructs a travel agency.
     *
     * @param serviceName name of the travel agency
     * @param location agency location
     * @param numberOfPackages number of tour packages
     * @param vehicleType type of transport vehicle
     */
    public TravelAgency(String serviceName, String location,
            int numberOfPackages, String vehicleType) {

        super(serviceName, location);
        this.numberOfPackages = numberOfPackages;
        this.vehicleType = vehicleType;
    }

    /**
     * Displays travel agency details.
     */
    public void displayAgencyDetails() {
        displayService();
        System.out.println("Tour Packages: " + numberOfPackages);
        System.out.println("Vehicle Type: " + vehicleType);
    }
}
