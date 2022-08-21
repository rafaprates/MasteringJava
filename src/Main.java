import Section_6_and_7_OOP.CarpetCostCalculator.Calculator;
import Section_6_and_7_OOP.CarpetCostCalculator.Carpet;
import Section_6_and_7_OOP.CarpetCostCalculator.Floor;
import Section_6_and_7_OOP.Encapsulation.Printer;

class Main {

    public static void main(String[] args) {

        Printer printer = new Printer(50, true);
        System.out.println(printer.addToner(50));
        System.out.println("initial page count = " +printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted +" new total print count for printer = " +printer.getPagesPrinted());
        pagesPrinted = printer.printPages(2);
        System.out.println("Pages printed was " + pagesPrinted +" new total print count for printer = " +printer.getPagesPrinted());
    }

}