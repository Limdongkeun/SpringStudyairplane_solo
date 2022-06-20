package SOLO_TEST.airplane.ticket;

public class Ticket {
    private Long clientId;
    private String country;
    private int ticketPrice;
    private int discountPrice;

    public Ticket(Long clientId, String country, int ticketPrice, int discountPrice) {
        this.clientId = clientId;
        this.country = country;
        this.ticketPrice = ticketPrice;
        this.discountPrice = discountPrice;

    }

    public int calculatePrice(){
        return ticketPrice - discountPrice;
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public int getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(int discountPrice) {
        this.discountPrice = discountPrice;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "clientId=" + clientId +
                ", country='" + country + '\'' +
                ", ticketPrice=" + ticketPrice +
                ", discountPrice=" + discountPrice +
                '}';
    }


}
