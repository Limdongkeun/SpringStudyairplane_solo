package SOLO_TEST.airplane;

import SOLO_TEST.airplane.client.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 회원가입이 되는지 임시로 시험
 */

public class ClientApp {
    public static void main(String[] args) {

        AppConfig appConfig = new AppConfig();
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        ClientService clientService = applicationContext.getBean("clientService", ClientService.class);
//        ClientService clientService =  appConfig.clientService();
//        ClientService clientService = new ClientServiceImpl();

        Long clientId = 1L;
        Client client = new Client(clientId,"limdongkeun",Grade.First);
        clientService.join(client);

        Client findClient = clientService.findClient(clientId);

        System.out.println("client = " + client.getName());
        System.out.println("client = " + client.getId());
        System.out.println("client = " + client.getGrade());
    }
}
