public class BankTransactionMain {

    static class BankTransaction {
        private String accountName;
        private String accountHolderName;
        private String accountType;
        private long accountNumber;
        private double balance;

        public BankTransaction(String accountName, String accountHolderName, String accountType, long accountNumber, double balance) {
            this.accountName = accountName;
            this.accountHolderName = accountHolderName;
            this.accountType = accountType;
            this.accountNumber = accountNumber;
            this.balance = balance;
        }

        public void displayTransactionInfo() {
            System.out.println("Account Name: " + accountName);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Type: " + accountType);
            System.out.println("Account Number: " + accountNumber);
            System.out.printf("Balance: %.2f\n", balance);
        }
    }

    public static void main(String[] args) {
        BankTransaction transaction = new BankTransaction("SBI", "Sulocha Yatageri", "Saving", 987654321012L, 50000.0);
        transaction.displayTransactionInfo();
    }
}
