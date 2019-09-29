package company;

import company.Class.Passenger;
import company.Class.Passengers;

import java.util.Scanner;

import static company.Class.FunUtils.isPositive;

/**
 * Class Main
 */
public class Main {
    /**
     * Main function
     */
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        int menu, length;
        boolean exit = false;
        System.out.print("Enter quantity of passengers: ");
        length = isPositive(str);
        Passengers passengers = new Passengers(length);
        System.out.println("Enter the information of all the passengers: ");
        construct(passengers, str, length);
        while (!exit) {
            System.out.println("1) Add passenger\n2) Show all passengers\n3)Passengers have sum mass of baggage over than 30\n4)Show all passengers` sum mass of baggage\n" +
                    "5)Location of baggage\n6)Remove passenger by last name\n7)Exit");
            menu = isPositive(str);
            switch (menu) {
                case 1:
                    System.out.print("Enter quantity of add passengers: ");
                    length = isPositive(str);
                    System.out.println("Enter the information of all the add passengers: ");
                    construct(passengers, str, length);
                    break;
                case 2:
                    System.out.println(passengers.toString());
                    break;
                case 3:
                    System.out.println(passengers.massOver30());
                    break;
                case 4:
                    System.out.println(passengers.allMassOfBaggage());
                    break;
                case 5:
                    System.out.print("Enter number baggage: ");
                    System.out.println(passengers.locationOfBaggage(str.next()));
                    break;
                case 6:
                    System.out.print("Enter last name: ");
                    passengers.removeByLastName(str.next());
                    break;
                case 7:
                    exit = true;
                    break;
                default:
                    System.out.println("Error");
                    break;
            }
        }


    }

    private static void construct(final Passengers passengers, Scanner str, final int length) {
        String name, lastName, patronymic, numberFlight, numberBaggage;
        int quantityPlace, sumMassOfBaggage = 0;
        for (int i = 0; i < length; i++){
            System.out.println((i + 1) + ") Passenger: ");
            System.out.print("Name: ");
            name = str.next();
            System.out.print("Last name: ");
            lastName = str.next();
            System.out.print("Patronymic: ");
            patronymic = str.next();
            System.out.print("Number flight: ");
            numberFlight = str.next();
            System.out.print("Number baggage: ");
            numberBaggage = str.next();
            System.out.print("Quantity place: ");
            quantityPlace = isPositive(str);
            for (int j = 0; j < quantityPlace; j++) {
                System.out.print((j + 1) + ") Mass of baggage: ");
                sumMassOfBaggage += isPositive(str);
            }
            passengers.pushBack(new Passenger(name, lastName, patronymic, numberFlight, numberBaggage, quantityPlace, sumMassOfBaggage));
        }
    }
}
