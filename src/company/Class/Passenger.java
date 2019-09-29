package company.Class;

/**
 * Class Passenger
 */
public class Passenger {
    /**
     * Name of passenger
     */
    private String name;
    /**
     * Last name of passenger
     */
    private String lastName;
    /**
     * Patronymic of passenger
     */
    private String patronymic;
    /**
     * Number flight of passenger
     */
    private String numberFlight;
    /**
     * Number baggage of passenger
     */
    private String numberBaggage;
    /**
     * Quantity place of baggage of passenger
     */
    private int quantityPlace;
    /**
     * All mass of baggage of passenger
     */
    private int allMassOfBaggage;

    public String getLastName() {
        return lastName;
    }

    public String getNumberFlight() {
        return numberFlight;
    }

    public String getNumberBaggage() {
        return numberBaggage;
    }

    public int getAllMassOfBaggage() {
        return allMassOfBaggage;
    }

    /**
     * Construct of Passenger class
     * @param name The name of passenger
     * @param lastName The last name of passenger
     * @param patronymic The patronymic of passenger
     * @param numberFlight The number flight of passenger
     * @param numberBaggage The number baggage of passenger
     * @param quantityPlace The quantity place of passenger
     * @param allMassOfBaggage The all mass of baggage of passenger
     */
    public Passenger(final String name, final String lastName, final String patronymic, final String numberFlight, final String numberBaggage, final int quantityPlace, final int allMassOfBaggage) {
        this.name = name;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.numberFlight = numberFlight;
        this.numberBaggage = numberBaggage;
        this.quantityPlace = quantityPlace;
        this.allMassOfBaggage = allMassOfBaggage;
    }

    @Override
    public String toString() {
        return "Name: " + this.lastName + " " + this.name + " " + this.patronymic + "\nNumber Flight: " + this.numberFlight + "\nNumber of baggage: " + this.numberBaggage + "\nQuantity place: " + this.quantityPlace + "\nAll mass of baggage: " + this.allMassOfBaggage;
    }
}
