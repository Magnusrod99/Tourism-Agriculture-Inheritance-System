// Author: Magnus Rodrigues
// Roll No: 2628
package main;

import agriculture.AgroTourismFarm;

/**
 * Tests hybrid inheritance in the agriculture and tourism domain.
 *
 * @author Magnus Rodrigues
 * @version 1.0
 */
public class HybridInheritanceTest {

    public static void main(String[] args) {

        System.out.println("===== HYBRID INHERITANCE =====");

        AgroTourismFarm farm = new AgroTourismFarm(
                "Green Valley Agro Tourism",
                "Ponda, Goa",
                "Rice",
                "Farm Stay and Bullock Cart Ride"
        );

        farm.displayAgroTourismDetails();
    }
}
