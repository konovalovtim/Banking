package Main;

import service.MessageValidatorService;
import java.util.Scanner;

public class Main {

    private static final MessageValidatorService messageValidatorService = new MessageValidatorService();

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        while (true) {
            String message = scn.nextLine();
            messageValidatorService.messageValidator(message);
        }

    }

}
