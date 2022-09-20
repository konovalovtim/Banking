package service;

public class MessageValidatorService {

    private final ClientsService clientsService = new ClientsService();

    public void messageValidator(String message) {

        String[] arr = message.split(" ");
        switch (arr[0]) {
            case "физлицо":
                clientsService.savePhys(arr);
                break;
            case "юрлицо":
                clientsService.saveLegally(arr);
                break;
            case "показать":
                clientsService.showClients(arr[1]);
                break;
            case "счет":
                clientsService.updateSchet(arr);
                break;
            default:
                System.out.println("некорректный ввод! Пожалуйста исправьте текст!");

        }

    }
}
