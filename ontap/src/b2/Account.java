package b2;

public abstract class Account {
    private String id;
    private String name;
    private double balance;

    public Account() {}
    public Account(String id, String name, double  balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }
    public abstract double getInterest();
    @Override
    public String toString() {
        return String.format("ID: %s | Name: %s | Balance: %.2f", id, name, balance);
    }
}
