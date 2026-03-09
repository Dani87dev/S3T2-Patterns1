package Factory;

public class SpainContactFactory implements ContactFactory{

    private String street;
    private String city;
    private String postalZip;
    private String phoneNumber;

    public SpainContactFactory(String street, String city, String postalZip, String phoneNumber){
        this.street = street;
        this.city = city;
        this.postalZip = postalZip;
        this.phoneNumber = phoneNumber;
    }


    @Override
    public Address createAddress() {
        Address spainAddress = new SpainAddress(street, city, postalZip);
        return spainAddress;
    }

    @Override
    public Phone createPhone() {
        Phone spainPhone = new SpainPhone(phoneNumber);
        return spainPhone;
    }
}
