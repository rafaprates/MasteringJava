package Section_8_Arrays_Lists_Autoboxing_Unboxing.Banking;

import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Branch> branches;

    public Bank(String bankName) {
        this.name = bankName;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String branchName) {
        if (findBranch(branchName) == null) {
            return branches.add(new Branch(branchName));
        }
        return false;
    }

    public boolean addCustomer(String branchName, String costumerName, double initialTransaction) {
        Branch branch = findBranch(branchName);
//        ArrayList<Customer> branchCustomers = branch.getCustomers();
//
//        for (int i=0; i<branchCustomers.size(); i++) {
//            if (branchCustomers.get(i).getName().equals(costumerName)) {
//                // Already exists
//                return false;
//            }
//        }

        if (branch != null) {
            return branch.newCustomer(costumerName, initialTransaction);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String costumerName, double amount) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.addCustomerTransaction(costumerName, amount);
        }
        return false;
    }

    private Branch findBranch(String branchName) {
        for (int i=0; i<branches.size(); i++) {
            if (branches.get(i).getName().equals(branchName)) {
                return new Branch(branchName);
            }
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean printTransactions) {
        Branch branch = new Branch(branchName);
        if (branch != null) {
            System.out.println("Costumer details for branch " + branch.getName());

            ArrayList<Customer> branchCustomers = branch.getCustomers();
            for (int i=0; i<branchCustomers.size(); i++) {
                Customer customer = branchCustomers.get(i);
                System.out.println("Customer: " + customer.getName() +
                        "[" + i + "]");
                if (printTransactions) {
                    System.out.println("Transactions:");
                    ArrayList<Double> transactions = customer.getTransactions();
                    for (int j=0; j<transactions.size(); j++) {
                        System.out.println("[" + (j+1) + "]" + " Amount" + transactions.get(j));
                    }
                }
            }
            return true;
        }
        return false;
    }
}
