package SOLO_TEST.airplane;

import SOLO_TEST.airplane.client.Client;
import SOLO_TEST.airplane.client.ClientService;
import SOLO_TEST.airplane.client.ClientServiceImpl;
import SOLO_TEST.airplane.client.Grade;
import SOLO_TEST.airplane.ticket.Ticket;
import SOLO_TEST.airplane.ticket.TicketService;
import SOLO_TEST.airplane.ticket.TicketServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class TicketServiceTest {

    ClientService clientService = new ClientServiceImpl();
    TicketService ticketService = new TicketServiceImpl();

    @Test
    void ticketing(){
        long clientId = 1L;
        Client client = new Client(clientId,"limdongkeun", Grade.First);
        clientService.join(client);

        Ticket ticket = ticketService.ticketing(clientId,"USA",10000);
        Assertions.assertThat(ticket.getDiscountPrice()).isEqualTo(2000);
    }
}
