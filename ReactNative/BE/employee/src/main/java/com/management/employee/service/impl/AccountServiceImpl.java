package com.management.employee.service.impl;

import com.management.employee.dto.AccountInfoDTO;
import com.management.employee.dto.AccountInfoExtraDTO;
import com.management.employee.entity.Account;
import com.management.employee.repository.AccountRepository;
import com.management.employee.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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

    @Override
    public List<AccountInfoDTO> getAccountInfo() {
        return accountRepository.getAccountInfo();
    }

    @Override
    public List<AccountInfoExtraDTO> getAccountsInfoExtra() {
        return accountRepository.getAccountsInfoExtra();
    }

    @Override
    public List<Account> searchAccount(int age, String skill, String level, int departmentId) {
        return accountRepository.findByAgeOrSkillOrLevelOrDepartmentId(age, skill, level, departmentId);
    }
    @Override
    public List<Account> createMultiAccount(List<Account> accounts) {
        return accountRepository.saveAllAndFlush(accounts);
    }

    @Override
    public Page<Account> getAllAccounts(Pageable pageable) {
        return accountRepository.findAll(pageable);
    }
}
