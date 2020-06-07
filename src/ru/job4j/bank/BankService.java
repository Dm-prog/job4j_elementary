package ru.job4j.bank;

import java.util.*;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();
    List<Account> list = new ArrayList<>();

    public void addUser(User user) {
        if (!users.containsKey(user)) {
            users.put(user, new ArrayList<>());
        }
    }

    public void addAccount(String passport, Account account) {
        for (User user : users.keySet()) {
            if (findByPassport(passport).equals(user)) {
                list.add(account);
            }
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
        for (Map.Entry<User, List<Account>> pair : users.entrySet())
            if (pair.getKey().equals(findByPassport(passport))) {
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
        return rsl;
    }
}
