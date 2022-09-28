package Main;

import service.MessageValidatorService;
import java.util.Scanner;

public class Main {

    private static final MessageValidatorService messageValidatorService = new MessageValidatorService();

    public static void main(String[] args) {
        System.out.println("Чтобы добавить физлицо введите клиента в формате: физлицо ФИО валюта(RUB, EUR, USD) тариф(простой, нормальный, сложный)");
        System.out.println("Чтобы добавить юрлицо введите организацию в формате: юрлицо имя организации валюта(RUB, EUR, USD) тариф(легкий, уверенный, профи)");
        System.out.println("Для изменения баланса введите: счет имя валюта сумма");
        System.out.println("чтобы показать всех физлиц введите \"показать физлиц\" и аналогично для юрлиц");
        Scanner scn = new Scanner(System.in);
        while (true) {
            String message = scn.nextLine();
            messageValidatorService.messageValidator(message);
        }

    }

}
