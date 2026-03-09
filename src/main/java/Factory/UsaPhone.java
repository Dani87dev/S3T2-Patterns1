package Factory;

public class UsaPhone implements Phone {

    private String phoneNumber;

    public UsaPhone(String phoneNumber) {
        if(phoneNumber.length()!=9){
            throw new RuntimeException("Usa Phone numbers must have 9 numbers");
        }
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String getFormatedPhoneNumber() {
        //+1 (098) 765-4321 - format USA
        return "+1 (0" + this.getPhoneNumber().substring(0, 2)
                + ") " + this.getPhoneNumber().substring(2, 5)
                + "-" + this.getPhoneNumber().substring(5, 9);

    }
}
