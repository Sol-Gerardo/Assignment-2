package Number_5;

public class Ticket implements SaleableItem{
    private String ticket;
    
    public Ticket(String ticket) {
        this.ticket = ticket;
    }

    public void sellCopy() {
        System.out.println("Selling a ticket for " + ticket + ".");
    }
}