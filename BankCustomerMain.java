// BankCustomerMain.java

class BankCustomer {
    private String custName;
    private String customerId;
    private String customerAddress;

    // Constructor
    public BankCustomer(String custName, String customerId, String customerAddress) {
        this.custName = custName;
        this.customerId = customerId;
        this.customerAddress = customerAddress;
    }

    public void displayCustomerInfo() {
        System.out.println("Customer Name: " + custName);
        System.out.println("Customer ID: " + customerId);
        System.out.println("Customer Address: " + customerAddress);
    }
}

public class BankCustomerMain {
    public static void main(String[] args) {
        // Creating and displaying customer details (pushed to main branch)
        BankCustomer customer = new BankCustomer("Sulocha Yatageri", "C12345", "Hubli, Karnataka");
        customer.displayCustomerInfo();
    }
}
