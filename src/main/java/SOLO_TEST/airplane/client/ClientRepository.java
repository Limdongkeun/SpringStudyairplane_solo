package SOLO_TEST.airplane.client;

public interface ClientRepository {

    /**
     *
     * 회원을 저장하는 곳
     */

    void save(Client client);

    Client findById(Long clientId);
}
