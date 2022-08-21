package Section_6_and_7_OOP.BillsBurger;

public class Hamburger {

    private String name;
    private String meat;
    private double price;
    private String breadRollType;
    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private String addition3Name;
    private double addition3Price;
    private String addition4Name;
    private double addition4Price;


    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
        System.out.println(name + " hamburger on a " + breadRollType + " roll with "
                + meat + ", price is " + price);
    }

    public void addHamburgerAddition1(String additionName, double price) {
        this.addition1Name = additionName;
        this.addition1Price = price;
        System.out.println("Added " + additionName + " for an extra " + price);
    }

    public void addHamburgerAddition2(String additionName, double price) {
        this.addition2Name = additionName;
        this.addition2Price = price;
        System.out.println("Added " + additionName + " for an extra " + price);
    }

    public void addHamburgerAddition3(String additionName, double price) {
        this.addition3Name = additionName;
        this.addition3Price = price;
        System.out.println("Added " + additionName + " for an extra " + price);
    }

    public void addHamburgerAddition4(String additionName, double price) {
        this.addition4Name = additionName;
        this.addition4Price = price;
        System.out.println("Added " + additionName + " for an extra " + price);
    }

    public double itemizeHamburger() {
        return price + addition1Price + addition2Price + addition3Price + addition4Price;
    }
}
