// Author: Magnus Rodrigues
// Roll No: 2628
package agriculture;

import interfaces.Irrigation;
import interfaces.FertilizerManagement;

/**
 * Represents a smart farm. Demonstrates multiple inheritance using two
 * interfaces.
 *
 * @author Magnus Rodrigues
 * @version 1.0
 */
public class SmartFarm implements Irrigation, FertilizerManagement {

    private String farmName;

    /**
     * Constructs a smart farm.
     *
     * @param farmName name of the farm
     */
    public SmartFarm(String farmName) {
        this.farmName = farmName;
    }

    /**
     * Starts the irrigation system.
     */
    @Override
    public void startIrrigation() {
        System.out.println("Irrigation system started.");
    }

    /**
     * Applies fertilizer to crops.
     */
    @Override
    public void applyFertilizer() {
        System.out.println("Fertilizer applied to crops.");
    }

    /**
     * Displays farm information and operations.
     */
    public void displayFarmDetails() {
        System.out.println("Farm Name: " + farmName);
        startIrrigation();
        applyFertilizer();
    }
}
