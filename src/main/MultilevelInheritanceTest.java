// Author: Magnus Rodrigues
// Roll No: 2628
package main;

import agriculture.OrganicCrop;

/**
 * Tests multilevel inheritance in the agriculture domain.
 *
 * @author Magnus Rodrigues
 * @version 1.0
 */
public class MultilevelInheritanceTest {

    public static void main(String[] args) {

        System.out.println("===== MULTILEVEL INHERITANCE =====");

        OrganicCrop crop = new OrganicCrop(
                "Green Valley Farm",
                "Ponda, Goa",
                "Rice",
                "Goa Organic Certification"
        );

        crop.displayOrganicCrop();
    }
}
