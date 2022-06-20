package SOLO_TEST.airplane.discount;

import SOLO_TEST.airplane.client.Client;
import SOLO_TEST.airplane.client.Grade;

public class FixDiscountPolicy implements DiscountPolicy{

    int fixDiscount = 1000;


    @Override
    public int discount(Client client, int price) {
        if(client.getGrade()== Grade.First){
            return  fixDiscount;
        }else {
            return 0;
        }
    }
}
