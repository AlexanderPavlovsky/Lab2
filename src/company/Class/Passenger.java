package company.Class;

public class Passenger {
    private String name;
    private String lastName;
    private String patronymic;
    private String numberFlight;
    private String numberBaggage;
    private int quantityPlace;
    private int sumMassOfBaggage;

    public String getLastName() {
        return lastName;
    }

    public String getNumberFlight() {
        return numberFlight;
    }

    public String getNumberBaggage() {
        return numberBaggage;
    }

    public int getSumMassOfBaggage() {
        return sumMassOfBaggage;
    }

    public Passenger(String name, String lastName, String patronymic, String numberFlight, String numberBaggage, int quantityPlace, int sumMassOfBaggage) {
        this.name = name;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.numberFlight = numberFlight;
        this.numberBaggage = numberBaggage;
        this.quantityPlace = quantityPlace;
        this.sumMassOfBaggage = sumMassOfBaggage;
    }

    @Override
    public String toString() {
        return "Name: " + this.lastName + " " + this.name + " " + this.patronymic + "\nNumber Flight: " + this.numberFlight + "\nNumber of baggage: " + this.numberBaggage + "\nQuantity place: " + this.quantityPlace + "\nSum mass of baggage: " + this.sumMassOfBaggage;
    }
}
