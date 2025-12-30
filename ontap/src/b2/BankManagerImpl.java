package b2;

import java.util.ArrayList;
import java.util.List;

public class BankManagerImpl implements BankManager{
    private List<SavingsAccount> list = new ArrayList<>();
    @Override
    public void addAccount(SavingsAccount a) {
        list.add(a);
    }

    @Override
    public void editAccount(SavingsAccount a) {
        boolean found = false;
        for (SavingsAccount x : list) {
            if (x.getId().equalsIgnoreCase(a.getId())) {
                x.setBalance(a.getBalance());
                x.setCustomerType(a.getCustomerType());
                x.setTerm(a.getTerm());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Loi: Khong tim thay Account ID " + a.getId());
        }
    }

    @Override
    public void sortAccount() {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = list.size() - 1; j > 0;  j--) {
                if (list.get(j).getInterest() > list.get(j - 1).getInterest()) {
                    SavingsAccount tmp = list.get(j);
                    list.set(j, list.get(j - 1));
                    list.set(j - 1, tmp);
                }
            }
        }
        System.out.println("Danh sach:");
        for (SavingsAccount x : list) {
            System.out.println(x.toString());
        }
    }

    @Override
    public double getTotalInterestPaid() {
        double sumInterest = 0;
        for (SavingsAccount x : list) {
            sumInterest += x.getInterest();
        }
        return sumInterest;
    }

}
