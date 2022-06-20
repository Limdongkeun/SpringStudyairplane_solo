package SOLO_TEST.airplane;

import SOLO_TEST.airplane.client.*;
import SOLO_TEST.airplane.ticket.Ticket;
import SOLO_TEST.airplane.ticket.TicketService;
import SOLO_TEST.airplane.ticket.TicketServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TicketApp {
    public static void main(String[] args) {

        AppConfig appConfig = new AppConfig();


        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        ClientService clientService = applicationContext.getBean("clientService", ClientService.class);
        TicketService ticketService = applicationContext.getBean("ticketService", TicketService.class);

//        ClientService clientService = appConfig.clientService();
//        TicketService ticketService = appConfig.ticketService();

//        ClientService clientService = new ClientServiceImpl();
//        TicketService ticketService = new TicketServiceImpl();

        Long clientId = 1L;

        Client client = new Client(clientId,"limdongkeun", Grade.First);
        clientService.join(client);

        Ticket ticket = ticketService.ticketing(clientId, "USA", 10000);

        System.out.println("ticket = " + ticket);
        System.out.println("usa.calculatePrice() = " + ticket.calculatePrice());

    }
}
