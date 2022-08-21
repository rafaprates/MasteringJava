package Section_6_and_7_OOP.BillsBurger;

public class DeluxeBurger extends Hamburger {

    public DeluxeBurger() {
        super("Deluxe", "Sausage & Bacon", 19.10, "White");
        System.out.println("Added Chips for an exntra 2.75");
        System.out.println("Added Drink for and extra 1.81");
    }

    @Override
    public void addHamburgerAddition1(String additionName, double price) {
        System.out.println("No additional items can be added.");
    }

    @Override
    public void addHamburgerAddition2(String additionName, double price) {
        System.out.println("No additional items can be added.");
    }

    @Override
    public void addHamburgerAddition3(String additionName, double price) {
        System.out.println("No additional items can be added.");
    }

    @Override
    public void addHamburgerAddition4(String additionName, double price) {
        System.out.println("No additional items can be added.");
    }
}
