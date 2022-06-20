package SOLO_TEST.airplane;

import SOLO_TEST.airplane.client.Client;
import SOLO_TEST.airplane.client.ClientService;
import SOLO_TEST.airplane.client.ClientServiceImpl;
import SOLO_TEST.airplane.client.Grade;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class ClientServiceTest {

    ClientService clientService = new ClientServiceImpl();

    @Test
    void join(){
        //given
        Client client = new Client(1L,"limdongkeun", Grade.First);

        //when
        clientService.join(client);
        Client findClient = clientService.findClient(1L);

        //then
        Assertions.assertThat(client).isEqualTo(findClient);
    }
}
