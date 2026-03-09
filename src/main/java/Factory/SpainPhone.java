package Factory;

public class SpainPhone implements Phone {

    private String phoneNumber;

    public SpainPhone(String phoneNumber) {

        if (phoneNumber.length() != 9) {
            throw new RuntimeException("The Spain phone number must have 9 numbers");
        }
        this.phoneNumber = phoneNumber;

    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String getFormatedPhoneNumber() {
        //+34 623 45 67 89 - format ESP
        return "+34 " + this.getPhoneNumber().substring(0, 3)
                + " " + this.getPhoneNumber().substring(3, 5)
                + " " + this.getPhoneNumber().substring(5, 7)
                + " " + this.getPhoneNumber().substring(7, 9);
    }
}
