package SOLO_TEST.airplane;

import SOLO_TEST.airplane.client.MemoryClientRepository;
import SOLO_TEST.airplane.client.ClientService;
import SOLO_TEST.airplane.client.ClientServiceImpl;
import SOLO_TEST.airplane.discount.DiscountPolicy;
import SOLO_TEST.airplane.discount.FixDiscountPolicy;
import SOLO_TEST.airplane.discount.RateDiscountPolicy;
import SOLO_TEST.airplane.ticket.TicketService;
import SOLO_TEST.airplane.ticket.TicketServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public ClientService clientService(){
        return new ClientServiceImpl(ClientRepository());
    }
    @Bean
    public MemoryClientRepository ClientRepository() {
        return new MemoryClientRepository();
    }

    @Bean
    public TicketService ticketService(){
        return new TicketServiceImpl(ClientRepository(), DiscountPolicy());
    }
    @Bean
    public DiscountPolicy DiscountPolicy() {
//        return new FixDiscountPolicy();
        return new RateDiscountPolicy();
    }


}
