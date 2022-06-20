package SOLO_TEST.airplane.discount;

import SOLO_TEST.airplane.client.Client;

public interface DiscountPolicy {

    int discount(Client client, int price);


}
