// Author: Magnus Rodrigues
// Roll No: 2628
package agriculture;

/**
 * Represents a crop grown on a farm. Extends AgricultureService.
 *
 * @author Magnus Rodrigues
 * @version 1.0
 */
public class Crop extends AgricultureService {

    protected String cropName;

    /**
     * Constructs a crop.
     *
     * @param farmName name of the farm
     * @param location farm location
     * @param cropName name of the crop
     */
    public Crop(String farmName, String location, String cropName) {
        super(farmName, location);
        this.cropName = cropName;
    }

    /**
     * Displays crop information.
     */
    public void displayCrop() {
        displayFarm();
        System.out.println("Crop Name: " + cropName);
    }
}
