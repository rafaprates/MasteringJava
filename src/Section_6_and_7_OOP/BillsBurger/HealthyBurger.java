package Section_6_and_7_OOP.BillsBurger;

public class HealthyBurger extends Hamburger {

    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;
    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown rye");
    }

    public void addHealthyAddition1 (String healthyExtraName, double healthyExtraPrice) {
        this.healthyExtra1Name = healthyExtraName;
        this.healthyExtra1Price = healthyExtraPrice;
        super.addHamburgerAddition1(healthyExtra1Name, healthyExtra1Price);
    }

    public void addHealthyAddition2 (String healthyExtraName, double healthyExtraPrice) {
        this.healthyExtra2Name = healthyExtraName;
        this.healthyExtra2Price = healthyExtraPrice;
        super.addHamburgerAddition2(healthyExtra2Name, healthyExtra2Price);
    }

    @Override
    public double itemizeHamburger() {
        return super.itemizeHamburger();
    }
}
