package com.management.employee.service.impl;

import com.management.employee.entity.Account;
import com.management.employee.repository.AccountRepository;
import com.management.employee.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired(required=true)
    private AccountRepository accountRepository;

    @Override
    public List<Account> getAllAccount() {
        return accountRepository.findAll();
    }

    @Override
    public Account createAccount(Account account) {
        return accountRepository.save(account);
    }

    @Override
    public Account updateAccount(Account account) {
        return accountRepository.save(account);
    }

    @Override
    public void deleteAccount(int id) {
        accountRepository.deleteById(id);
    }
}
