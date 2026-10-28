// Author: Magnus Rodrigues
// Roll No: 2628
package main;

import tourism.HotelService;

/**
 * Tests single inheritance in the tourism domain.
 *
 * @author Magnus Rodrigues
 * @version 1.0
 */
public class SingleInheritanceTest {

    public static void main(String[] args) {

        System.out.println("===== SINGLE INHERITANCE =====");

        HotelService hotel = new HotelService(
                "Goa Beach Resort",
                "Calangute, Goa",
                25,
                3500.00
        );

        hotel.displayHotelDetails();
    }
}
