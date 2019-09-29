package company.Class;

import java.util.Arrays;

/**
 * Class Passengers
 */
public class Passengers {
    /**
     * Array Passenger
     */
    private Passenger[] passengers;

    /**
     * Construct Passengers
     * @param length Quantity of passengers
     */
    public Passengers(final int length) {
        this.passengers = new Passenger[length];
    }

    private void resize(final int newLength) {
        this.passengers = Arrays.copyOf(this.passengers, newLength);
    }

    /**
     * Push back to array passengers
     * @param passenger Object Passenger
     */
    public void pushBack(final Passenger passenger) {
        for (int i = 0; i < this.passengers.length; i++) {
            if (this.passengers[i] == null) {
                this.passengers[i] = passenger;
                break;
            } else {
                if (i == this.passengers.length - 1) {
                    resize(this.passengers.length + 1);
                }
            }
        }
    }

    /**
     * Passengers have all mass of baggage over 30
     * @return get passenger have mass over 30
     */
    public String massOver30() {
        final StringBuilder result = new StringBuilder();
        for (int i = 0; i < passengers.length; i++) {
            if (passengers[i].getAllMassOfBaggage() > 30) {
                result.append(i + 1).append(") ").append(passengers[i].toString()).append("\n");
            }
        }
        return result.toString();
    }

    /**
     * All mass of baggage of everybody passenger
     * @return get all mass of baggage of everybody passenger
     */
    public String allMassOfBaggage() {
        final StringBuilder result = new StringBuilder();
        for (int i = 0; i < passengers.length; i++) {
            result.append(i + 1).append(") Passenger ").append(passengers[i].getAllMassOfBaggage()).append("\n");
        }
        return result.toString();
    }

    /**
     * Location of baggage (number flight)
     * @param numberBaggage number baggage
     * @return number flight
     */
    public String locationOfBaggage(final String numberBaggage) {
        String result = "";
        for (Passenger passenger : passengers) {
            if (passenger.getNumberBaggage().equals(numberBaggage)) {
                result = "Number Flight: " + passenger.getNumberFlight();
            } else {
                result = "Number of baggage doesn't exist";
            }
        }
        return result;
    }

    /**
     * Remove passenger by last name
     * @param lastName last name
     */
    public void removeByLastName(final String lastName) {
        int numberOfPassenger;
        for (numberOfPassenger = 0; numberOfPassenger < passengers.length; numberOfPassenger++) {
            if (passengers[numberOfPassenger].getLastName().equals(lastName)) {
                break;
            }
        }
        if (numberOfPassenger != passengers.length - 1) {
            for (; numberOfPassenger < passengers.length - 1; numberOfPassenger++) {
                passengers[numberOfPassenger] = passengers[numberOfPassenger + 1];
            }
        }
        resize(passengers.length - 1);
    }

    @Override
    public String toString() {
        final StringBuilder result = new StringBuilder();
        for (int i = 0; i < passengers.length; i++) {
            result.append(i + 1).append(") ").append(passengers[i].toString()).append("\n");
        }
        return result.toString();
    }


}
