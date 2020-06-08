package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();
    List<Account> list = new ArrayList<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    public void addAccount(String passport, Account account) {
        if (!(findByPassport(passport) == null && users.containsValue(account))) {
            list.add(account);
        }
    }

    public User findByPassport(String passport) {
        for (User user : users.keySet())
            if (user.getPassport().equals(passport)) {
                return user;
            }
        return null;
    }

    public Account findByRequisite(String passport, String requisite) {
        if (findByPassport(passport) != null) {
            for (Account account : list) {
                if (account.getRequisite().equals(requisite)) {
                    return account;
                }
            }

        }
        return null;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String dеstRequisite, double amount) {
        boolean rsl = false;
        Account account1 = findByRequisite(srcPassport, srcRequisite);
        Account account2 = findByRequisite(destPassport, dеstRequisite);

        if (account1 != null && account2 != null) {
            account1.setBalance(amount - account2.getBalance());
            account2.setBalance(account2.getBalance() + amount);
        } else {
            rsl = true;
        }
        return rsl;
    }
}
