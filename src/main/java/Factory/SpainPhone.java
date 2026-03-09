package Factory;

public class SpainPhone implements Phone {

    private String phoneNumber;

    public SpainPhone(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String getFormatedPhoneNumber() {
        //+34 623 45 67 89 - format ESP
        return "+34 " + this.getPhoneNumber().substring(0, 2)
                + " " + this.getPhoneNumber().substring(3, 4)
                + " " + this.getPhoneNumber().substring(5, 6)
                + " " + this.getPhoneNumber().substring(7, 8);
    }
}
