// Author: Magnus Rodrigues
// Roll No: 2628
package agriculture;

import interfaces.Irrigation;
import interfaces.FertilizerManagement;

/**
 * Represents a farm offering agricultural and tourism activities. Demonstrates
 * hybrid inheritance by extending Crop and implementing multiple interfaces.
 *
 * @author Magnus Rodrigues
 * @version 1.0
 */
public class AgroTourismFarm extends Crop
        implements Irrigation, FertilizerManagement {

    private String touristActivity;

    /**
     * Constructs an agro-tourism farm.
     *
     * @param farmName name of the farm
     * @param location farm location
     * @param cropName name of the crop
     * @param touristActivity tourism activity offered
     */
    public AgroTourismFarm(String farmName, String location,
            String cropName, String touristActivity) {

        super(farmName, location, cropName);
        this.touristActivity = touristActivity;
    }

    /**
     * Starts the irrigation system.
     */
    @Override
    public void startIrrigation() {
        System.out.println("Agro-tourism farm irrigation started.");
    }

    /**
     * Applies fertilizer to crops.
     */
    @Override
    public void applyFertilizer() {
        System.out.println("Organic fertilizer applied.");
    }

    /**
     * Displays agro-tourism farm details.
     */
    public void displayAgroTourismDetails() {
        displayCrop();
        System.out.println("Tourist Activity: " + touristActivity);
        startIrrigation();
        applyFertilizer();
    }
}
