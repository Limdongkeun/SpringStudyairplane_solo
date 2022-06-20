package SOLO_TEST.airplane.ticket;

public interface TicketService {

    Ticket ticketing(Long clientId, String country, int ticketPrice);
}
