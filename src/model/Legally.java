package model;

public class Legally implements Clients{
    private String name;
    private Currency currency;
    private int dengi;
    private LegallyTarifs tarif;


    public Legally(String name, Currency currency, int dengi, LegallyTarifs legallyTarifs) {
        this.name = name;
        this.currency = currency;
        this.dengi = dengi;
        this.tarif = legallyTarifs;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public LegallyTarifs getTarif() {
        return tarif;
    }

    public void setTarif(LegallyTarifs tarif) {
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
        return name + " " + currency + " " + dengi + " " + tarif;
    }
}
