package Factory;

public class Contact {

    private Address address;
    private Phone phone;

    public Contact(ContactFactory factory){
        this.address = factory.createAddress();
        this.phone = factory.createPhone();
    }

    public Address getAdress() {
        return address;
    }

    public Phone getPhone() {
        return phone;
    }

    @Override
    public String toString(){
        return "Address: " + address.getFormatedAdress() + " | Phone: " + phone.getFormatedPhoneNumber();
    }
}
