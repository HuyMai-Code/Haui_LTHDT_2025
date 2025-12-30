package b2;

public class SavingsAccount extends Account{
    private String customerType;
    private int term;

    public SavingsAccount() {}
    public SavingsAccount(String id, String name, double balance, String customerType, int term) {
        super(id, name, balance);
        this.customerType = customerType;
        this.term = term;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }
    public String getCustomerType() {
        return customerType;
    }
    public void setTerm(int term) {
        this.term = term;
    }
    public int getTerm() {
        return term;
    }
    public double getInterest() {
        double heSo = 1.0;
        if (customerType.equalsIgnoreCase("VIP")) {
            if (term < 6) {
                heSo = 1.2;
            } else {
                heSo = 2.0;
            }
        } else if (customerType.equalsIgnoreCase("STANDARD")) {
            if (term < 6) {
                heSo = 1.0;
            } else {
                heSo = 1.5;
            }
        }
        return getBalance() * heSo;
    }
    public String toString() {
        return String.format("ID: %s | Name: %s | Balance: %.2f | CustomerType: %s | Term: %d | TienLai: %.2f", getId(), getName(), getBalance(), customerType, term, getInterest());
    }
}
