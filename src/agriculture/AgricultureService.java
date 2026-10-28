// Author: Magnus Rodrigues
// Roll No: 2628
package agriculture;

/**
 * Represents a general agriculture service.
 *
 * @author Magnus Rodrigues
 * @version 1.0
 */
public class AgricultureService {

    protected String farmName;
    protected String location;

    /**
     * Constructs an agriculture service.
     *
     * @param farmName name of the farm
     * @param location farm location
     */
    public AgricultureService(String farmName, String location) {
        this.farmName = farmName;
        this.location = location;
    }

    /**
     * Displays basic farm information.
     */
    public void displayFarm() {
        System.out.println("Farm Name: " + farmName);
        System.out.println("Location: " + location);
    }
}
