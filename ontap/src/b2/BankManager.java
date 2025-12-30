package b2;

public interface BankManager {
    void addAccount(SavingsAccount a);
    void editAccount(SavingsAccount a);
    void sortAccount();
    double getTotalInterestPaid();
}
