// Author: Magnus Rodrigues
// Roll No: 2628
package agriculture;

/**
 * Represents an organically grown crop. Demonstrates the third level of
 * multilevel inheritance.
 *
 * @author Magnus Rodrigues
 * @version 1.0
 */
public class OrganicCrop extends Crop {

    private String organicCertification;

    /**
     * Constructs an organic crop.
     *
     * @param farmName name of the farm
     * @param location farm location
     * @param cropName name of the crop
     * @param organicCertification certification details
     */
    public OrganicCrop(String farmName, String location,
            String cropName, String organicCertification) {

        super(farmName, location, cropName);
        this.organicCertification = organicCertification;
    }

    /**
     * Displays organic crop details.
     */
    public void displayOrganicCrop() {
        displayCrop();
        System.out.println("Organic Certification: " + organicCertification);
    }
}
