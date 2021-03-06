package ru.job4j.bank;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    public void addAccount(String passport, Account account) {
        Optional<User> user = findByPassport(passport);
        if (user.isPresent()) {
            List<Account> list = users.get(user.get());
            if (!list.contains(account)) {
                users.get(user.get()).add(account);
            }
        }
    }

    //    public User findByPassport(String passport) {
//        return users.keySet().stream()
//                .filter(k -> k.getPassport().equals(passport))
//                .findFirst().orElse(null);
//    }
    public Optional<User> findByPassport(String passport) {
        Optional<User> rsl = Optional.empty();
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                rsl = Optional.of(user);
                break;
            }
        }
        return rsl;
    }


//    public Account findByRequisite(String passport, String requisite) {
//        User user = findByPassport(passport);
//        Account result = null;
//        if (user != null) {
//            return users.get(user).stream()
//                    .filter(v -> v.getRequisite().equals(requisite))
//                    .findFirst().orElse(null);
//        }
//        return result;
//    }

    public Optional<Account> findByRequisite(String passport, String requisite) {
        Optional<Account> rsl = Optional.empty();
        Optional<User> user = findByPassport(passport);
        if (user.isPresent()) {
            for (Account account : users.get(user.get())) {
                if (account.getRequisite().equals(requisite)) {
                    rsl = Optional.of(account);
                    break;
                }
            }
        }
        return rsl;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Optional<Account> srcAccount = findByRequisite(srcPassport, srcRequisite);
        Optional<Account> destAccount = findByRequisite(destPassport, destRequisite);

        if (srcAccount.isPresent() && destAccount.isPresent() && srcAccount.get().getBalance() >= amount) {
            srcAccount.get().setBalance(srcAccount.get().getBalance() - amount);
            destAccount.get().setBalance(destAccount.get().getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }
}
