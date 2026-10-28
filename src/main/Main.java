// Author: Magnus Rodrigues
// Roll No: 2628
package main;

import java.util.Scanner;

import tourism.HotelService;
import tourism.TravelAgency;

import agriculture.SmartFarm;
import agriculture.OrganicCrop;
import agriculture.AgroTourismFarm;

/**
 * Main menu-driven application demonstrating all five types of inheritance
 * using Tourism and Agriculture examples.
 *
 * @author Magnus Rodrigues
 * @version 1.0
 */
public class Main {

    /**
     * Displays the inheritance demonstration menu.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n======================================");
            System.out.println(" TOURISM AND AGRICULTURE SYSTEM");
            System.out.println(" INHERITANCE DEMONSTRATION");
            System.out.println("======================================");
            System.out.println("1. Single Inheritance");
            System.out.println("2. Multiple Inheritance");
            System.out.println("3. Multilevel Inheritance");
            System.out.println("4. Hierarchical Inheritance");
            System.out.println("5. Hybrid Inheritance");
            System.out.println("0. Exit");
            System.out.println("======================================");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("\n===== SINGLE INHERITANCE =====");

                    HotelService hotel = new HotelService(
                            "Goa Beach Resort",
                            "Calangute, Goa",
                            25,
                            3500.00
                    );

                    hotel.displayHotelDetails();
                    break;

                case 2:
                    System.out.println("\n===== MULTIPLE INHERITANCE =====");

                    SmartFarm farm = new SmartFarm(
                            "Green Valley Organic Farm"
                    );

                    farm.displayFarmDetails();
                    break;

                case 3:
                    System.out.println("\n===== MULTILEVEL INHERITANCE =====");

                    OrganicCrop crop = new OrganicCrop(
                            "Green Valley Farm",
                            "Ponda, Goa",
                            "Rice",
                            "Goa Organic Certification"
                    );

                    crop.displayOrganicCrop();
                    break;

                case 4:
                    System.out.println("\n===== HIERARCHICAL INHERITANCE =====");

                    System.out.println("\n--- Hotel Service ---");

                    HotelService hotelService = new HotelService(
                            "Goa Beach Resort",
                            "Calangute, Goa",
                            25,
                            3500.00
                    );

                    hotelService.displayHotelDetails();

                    System.out.println("\n--- Travel Agency ---");

                    TravelAgency agency = new TravelAgency(
                            "Goa Explorer Travels",
                            "Panaji, Goa",
                            15,
                            "Tourist Bus"
                    );

                    agency.displayAgencyDetails();
                    break;

                case 5:
                    System.out.println("\n===== HYBRID INHERITANCE =====");

                    AgroTourismFarm agroFarm = new AgroTourismFarm(
                            "Green Valley Agro Tourism",
                            "Ponda, Goa",
                            "Rice",
                            "Farm Stay and Bullock Cart Ride"
                    );

                    agroFarm.displayAgroTourismDetails();
                    break;

                case 0:
                    System.out.println("\nThank you for using the system!");
                    break;

                default:
                    System.out.println("\nInvalid choice! Please try again.");
            }

        } while (choice != 0);

        scanner.close();
    }
}
