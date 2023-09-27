package com.management.employee.service;

import com.management.employee.entity.Account;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AccountService {
    public List<Account> getAllAccount();

    public Account createAccount(Account account);

    public Account updateAccount(Account account);

    public void deleteAccount(int id);
}
