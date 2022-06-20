package SOLO_TEST.airplane;

import SOLO_TEST.airplane.client.Client;
import SOLO_TEST.airplane.client.ClientService;
import SOLO_TEST.airplane.client.Grade;
import SOLO_TEST.airplane.ticket.Ticket;
import SOLO_TEST.airplane.ticket.TicketService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FixTicketServiceTest {

    ClientService clientService;
    TicketService ticketService;

    @BeforeEach
    public void beforEach(){
        AppConfig appConfig = new AppConfig();
        clientService = appConfig.clientService();
        ticketService = appConfig.ticketService();
    }

    @Test
    void ticketing(){
        long clientId = 1L;
        Client client = new Client(clientId,"limdongkeun", Grade.First);
        clientService.join(client);

        Ticket ticket = ticketService.ticketing(clientId,"USA",10000);
        Assertions.assertThat(ticket.getDiscountPrice()).isEqualTo(1000);
    }
}
