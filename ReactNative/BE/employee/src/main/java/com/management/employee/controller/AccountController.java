package com.management.employee.controller;

import com.management.employee.dto.AccountInfoDTO;
import com.management.employee.entity.Account;
import com.management.employee.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class AccountController {
    @Autowired
    private AccountService accountService;

    @GetMapping(value = "/account/getAll")
    public List<Account> getAllAccount() {
        return accountService.getAllAccount();
    }

    @PostMapping(value = "/account/createAccount")
    public Account createAccount(@RequestBody Account account) {
        return accountService.createAccount(account);
    }

    @PutMapping(value ="/account/updateAccount")
    public Account updateAccount(@RequestBody Account account) {
        return accountService.updateAccount(account);
    }

    @DeleteMapping(value = "/account/deleteAccount/{id}")
    public void deleteAccount(@PathVariable int id) {
        accountService.deleteAccount(id);
    }
    @GetMapping(value = "/account/AccountInfo")
    public List<AccountInfoDTO> getAccountDetail(){
        return accountService.getAccountInfo();
    }
}
