package service;

import model.*;
import java.util.ArrayList;

public class ClientsService {

    private final ArrayList<Clients> physList = new ArrayList<>();
    private final ArrayList<Clients> legalList = new ArrayList<>();

    public void savePhys(String[] arr) {
        physList.add(new Physical(arr[2], arr[1], arr[3], getCurrency(arr[4]), 0, getPhysTarifs(arr[5])));
    }

    public void saveLegally(String[] arr) {
        legalList.add(new Legally(arr[1], getCurrency(arr[2]), 0, getLegallyTarifs(arr[3])));
    }

    public void updateSchet(String[] arr) {
        if (arr.length == 4) {
            updateLegallySchet(arr[1], getCurrency(arr[2]), Integer.parseInt(arr[3]));
        } else {
            updatePhysSchet(arr[1], getCurrency(arr[4]), Integer.parseInt(arr[5]));
        }
    }

    private void updateLegallySchet(String name, Currency currency, int dengi) {
        for (Clients legally : legalList) {
            Legally legall = (Legally) legally;
            if (legall.getName().equals(name) && legall.getCurrency() == currency) {
                if ((legall.getDengi() + dengi) >= 0) {
                    legall.setDengi(legall.getDengi() + dengi);
                } else {
                    System.out.println("У вас недостаточно средств на счете " + legall.getCurrency());
                }
            }
        }
    }

    public void updatePhysSchet(String lastName, Currency currency, int dengi) {
        for (Clients physical : physList) {
            Physical physicaly = (Physical) physical;
            if (physicaly.getLastName().equals(lastName) && physicaly.getCurrency() == currency) {
                if ((physicaly.getDengi() + dengi) >= 0) {
                    physicaly.setDengi(physicaly.getDengi() + dengi);
                } else {
                    System.out.println("У вас недостаточно средств на счете " + physicaly.getCurrency());
                }
            }
        }
    }

    public void showClients(String s) {
        if (s.equals("физлиц")) {
            show(physList);
        } else {
            show(legalList);
        }
    }

    private void show(ArrayList<Clients> list) {
        for (Clients x : list) {
            System.out.println(x.toString());
        }
    }

    private Currency getCurrency(String currency) {
        switch (currency) {
            case ("RUB"):
                return Currency.RUB;
            case ("EUR"):
                return Currency.EUR;
            default:
                return Currency.USD;
        }
    }

    private PhysTarifs getPhysTarifs(String tarif) {
        switch (tarif) {
            case ("простой"):
                return PhysTarifs.PROSTOI;
            case ("нормальный"):
                return PhysTarifs.NORM;
            default:
                return PhysTarifs.SLOZHNI;
        }
    }

    private LegallyTarifs getLegallyTarifs(String tarif) {
        switch (tarif) {
            case ("легкий"):
                return LegallyTarifs.LEGKI;
            case ("уверенный"):
                return LegallyTarifs.UVERENNI;
            default:
                return LegallyTarifs.PROFI;
        }
    }
}
