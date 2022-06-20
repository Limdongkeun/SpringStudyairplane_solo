package SOLO_TEST.airplane.client;

public interface ClientService {

    // 회원 가입한다
    void join(Client client);

    //회원을 조회한다
    Client findClient(Long ClientId);
}
