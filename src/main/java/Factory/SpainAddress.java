package Factory;

public class SpainAddress implements Address {

    private String street;
    private String city;
    private String postalZip;

    public SpainAddress(String street, String city, String postalZip) {
        this.street = street;
        this.city = city;
        this.postalZip = postalZip;
    }

    public String getPostalZip() {
        return postalZip;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    @Override
    public String getFormatedAdress() {
        return this.getStreet() + ", " + this.getPostalZip() + " " + this.getCity();
        //Carrer Major 34, 08001 Barcelona
    }
}
