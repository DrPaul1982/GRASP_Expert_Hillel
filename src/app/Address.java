package app;

public class Address {
    private final String city;
    private final String street;
    private final String flat;


    public Address(String city, String street, String flat) {
        this.city = city;
        this.street = street;
        this.flat = flat;
    }

    @Override
    public String toString() {
        return "address: " + city + ", " + street + ", " + flat;
    }
}

