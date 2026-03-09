package Factory;

public class UsaPhone implements Phone {

    private String phoneNumber;

    public UsaPhone(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String getFormatedPhoneNumber() {
        //+1 (098) 765-4321 - format USA
        return "+1 " + this.getPhoneNumber().substring(0, 1)
                + ") " + this.getPhoneNumber().substring(2, 4)
                + "-" + this.getPhoneNumber().substring(5, 8);

    }
}
