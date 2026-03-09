package Factory;

public class UsaContactFactory implements ContactFactory{

    private String street;
    private String city;
    private String postalZip;
    private String phoneNumber;

    public UsaContactFactory(String street, String city, String postalZip, String phoneNumber) {
        this.street = street;
        this.city = city;
        this.postalZip = postalZip;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public Address createAddress() {
        Address usaAddress = new UsaAddress(street, city, postalZip);
        return usaAddress;
    }

    @Override
    public Phone createPhone() {
        Phone usaPhone = new UsaPhone(phoneNumber);
        return usaPhone;
    }
}
