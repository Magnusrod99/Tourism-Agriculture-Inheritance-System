// Author: Magnus Rodrigues
// Roll No: 2628
package main;

import tourism.HotelService;
import tourism.TravelAgency;

/**
 * Tests hierarchical inheritance in the tourism domain.
 *
 * @author Magnus Rodrigues
 * @version 1.0
 */
public class HierarchicalInheritanceTest {

    public static void main(String[] args) {

        System.out.println("===== HIERARCHICAL INHERITANCE =====");

        System.out.println("\n--- Hotel Service ---");

        HotelService hotel = new HotelService(
                "Goa Beach Resort",
                "Calangute, Goa",
                25,
                3500.00
        );

        hotel.displayHotelDetails();

        System.out.println("\n--- Travel Agency ---");

        TravelAgency agency = new TravelAgency(
                "Goa Explorer Travels",
                "Panaji, Goa",
                15,
                "Tourist Bus"
        );

        agency.displayAgencyDetails();
    }
}
