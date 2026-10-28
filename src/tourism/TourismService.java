// Author: Magnus Rodrigues
// Roll No: 2628
package tourism;

/**
 * Represents a general tourism service. Provides common details for tourism
 * services.
 *
 * @author Magnus Rodrigues
 * @version 1.0
 */
public class TourismService {

    protected String serviceName;
    protected String location;

    /**
     * Constructs a tourism service.
     *
     * @param serviceName name of the tourism service
     * @param location location of the service
     */
    public TourismService(String serviceName, String location) {
        this.serviceName = serviceName;
        this.location = location;
    }

    /**
     * Displays general tourism service information.
     */
    public void displayService() {
        System.out.println("Service Name: " + serviceName);
        System.out.println("Location: " + location);
    }
}
