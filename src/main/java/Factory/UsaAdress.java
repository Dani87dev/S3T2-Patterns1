package Factory;

public class UsaAdress implements Adress{

    private String street;
    private String city;
    private String postalZip;

    public UsaAdress(String street, String city, String postalZip) {
        this.street = street;
        this.city = city;
        this.postalZip = postalZip;
    }

    public String getStreet() {
        return street;
    }

    public String getPostalZip() {
        return postalZip;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String getFormatedAdress() {
        return this.getStreet() + ", " + this.getCity() + ", " + this.getPostalZip();
        //154 5th Avenue, New York, NY 10001
    }
}
