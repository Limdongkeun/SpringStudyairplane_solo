package SOLO_TEST.airplane.client;

public class ClientServiceImpl implements ClientService{

    ClientRepository clientRepository;

    public ClientServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public Client findClient(Long ClientId) {
        return clientRepository.findById(ClientId);
    }

    @Override
    public void join(Client clientId) {
        clientRepository.save(clientId);
    }


}
