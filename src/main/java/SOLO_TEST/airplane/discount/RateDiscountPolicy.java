package SOLO_TEST.airplane.discount;

import SOLO_TEST.airplane.client.Client;
import SOLO_TEST.airplane.client.Grade;

public class RateDiscountPolicy implements DiscountPolicy{

    int firstDiscountRate = 20;
    int businessDiscountRate = 10;

    @Override
    public int discount(Client client, int price) {
        if(client.getGrade() == Grade.First){
            return price * firstDiscountRate/100;
        } else if (client.getGrade()==Grade.Business) {
            return price * businessDiscountRate/100;
        }else {
            return 0;
        }
    }
}
