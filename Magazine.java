package Number_5;

public class Magazine implements SaleableItem{
    private String magTitle;

    Magazine(String magTitle) {
        this.magTitle = magTitle;
    }

    public void sellCopy() {
        System.out.println("Selling a copy of " + magTitle + " magazine.");
    }
}