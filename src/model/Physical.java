package model;

public class Physical implements Clients {

    private String firstName;
    private String lastName;
    private String secondName;
    private Currency currency;
    private int dengi;
    private PhysTarifs tarif;


    public Physical(String firstName, String lastName, String secondName, Currency currency, int dengi, PhysTarifs tarif) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.secondName = secondName;
        this.currency = currency;
        this.dengi = dengi;
        this.tarif = tarif;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public PhysTarifs getTarif() {
        return tarif;
    }

    public void setTarif(PhysTarifs tarif) {
        this.tarif = tarif;
    }

    public int getDengi() {
        return dengi;
    }

    public void setDengi(int dengi) {
        this.dengi = dengi;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " " + secondName + " " + currency + " " + dengi + " " + tarif;
    }
}
