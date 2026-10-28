// Author: Magnus Rodrigues
// Roll No: 2628
package main;

import agriculture.SmartFarm;

/**
 * Tests multiple inheritance using interfaces.
 *
 * @author Magnus Rodrigues
 * @version 1.0
 */
public class MultipleInheritanceTest {

    public static void main(String[] args) {

        System.out.println("===== MULTIPLE INHERITANCE =====");

        SmartFarm farm = new SmartFarm("Green Valley Organic Farm");

        farm.displayFarmDetails();
    }
}
