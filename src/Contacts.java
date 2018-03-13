

public class Contacts {


    private String name;

    private double phoneNumber;

    public Contacts(String[] fields) {
        name=fields[0];
        phoneNumber= Double.parseDouble(fields[0]);
    }

    public Contacts(String name, double phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(double phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
