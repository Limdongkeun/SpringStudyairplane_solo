package SOLO_TEST.airplane.ticket;

import SOLO_TEST.airplane.client.*;
import SOLO_TEST.airplane.discount.DiscountPolicy;


public class TicketServiceImpl implements TicketService{

//    private final DiscountPolicy discountPolicy = new FixDiscountPolicy();
//    private final DiscountPolicy discountPolicy = new RateDiscountPolicy();
    private ClientRepository clientRepository;
    private DiscountPolicy discountPolicy;

    public TicketServiceImpl(ClientRepository clientRepository, DiscountPolicy discountPolicy) {
        this.clientRepository = clientRepository;
        this.discountPolicy = discountPolicy;
    }

    @Override
    public Ticket ticketing(Long clientId, String country, int ticketPrice) {
        Client client = clientRepository.findById(clientId);
        int discountPrice = discountPolicy.discount(client,ticketPrice);

        return new Ticket(clientId,country,ticketPrice,discountPrice);

    }
}
