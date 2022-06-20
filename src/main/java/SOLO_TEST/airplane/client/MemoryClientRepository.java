package SOLO_TEST.airplane.client;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * 회원을 저장하는 곳
 */

public class MemoryClientRepository implements ClientRepository{

    private static Map<Long, Client> store = new HashMap<>();

    //회원이 작성한것을 저장 map에 넣는다
    @Override
    public void save(Client client) {
        store.put(client.getId(), client);
    }

    //map에서 id로 client의 이름을 찾는다
    @Override
    public Client findById(Long clientId) {
        return store.get(clientId);
    }

//    public int aaa(){
//        return store.size();
//    }
}
