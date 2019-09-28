package company.Class;

import java.util.Arrays;

public class Passengers {
    private Passenger[] passengers;

    public Passengers(int length) {
        this.passengers = new Passenger[length];
    }

    private void resize(int newLength) {
        this.passengers = Arrays.copyOf(this.passengers, newLength);
    }

    public void push_back(Passenger passenger) {
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

    public String massOver30() {
        final StringBuilder result = new StringBuilder();
        for (int i = 0; i < passengers.length; i++) {
            if (passengers[i].getSumMassOfBaggage() > 30) {
                result.append(i + 1).append(") ").append(passengers[i].toString()).append("\n");
            }
        }
        return result.toString();
    }

    public String allMassOfBaggage() {
        final StringBuilder result = new StringBuilder();
        for (int i = 0; i < passengers.length; i++) {
            result.append(i + 1).append(")Passenger").append(passengers[i].getSumMassOfBaggage()).append("\n");
        }
        return result.toString();
    }

    public String locationOfBaggage(String numberBaggage) {
        String result = null;
        for (int i = 0; i < passengers.length; i++) {
            if (passengers[i].getNumberBaggage().equals(numberBaggage)) {
                result = "Number Flight: " + passengers[i].getNumberFlight();
            } else {
                result = "Number of baggage doesn't exist";
            }
        }
        return result;
    }

    public void removeByLastName(String lastName) {
        int i;
        for (i = 0; i < passengers.length; i++) {
            if (passengers[i].getLastName().equals(lastName)) {
                break;
            }
        }
        if (i != passengers.length - 1) {
            for (; i < passengers.length - 1; i++) {
                passengers[i] = passengers[i + 1];
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
