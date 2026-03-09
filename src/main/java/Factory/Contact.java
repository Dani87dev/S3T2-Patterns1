package Factory;

public class Contact {

    private Adress adress;
    private Phone phone;

    public Contact(ContactFactory factory){
        this.adress = factory.createAddress();
        this.phone = factory.createPhone();
    }

    public Adress getAdress() {
        return adress;
    }

    public Phone getPhone() {
        return phone;
    }

    @Override
    public String toString(){
        return "Address: " + adress.getFormatedAdress() + " | Phone: " + phone.getFormatedPhoneNumber();
    }
}
