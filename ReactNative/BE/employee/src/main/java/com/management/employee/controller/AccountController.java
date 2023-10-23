package com.management.employee.controller;

import com.management.employee.dto.AccountInfoDTO;
import com.management.employee.dto.AccountInfoDTOimpl;
import com.management.employee.dto.AccountInfoExtraDTO;
import com.management.employee.entity.Account;
import com.management.employee.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class AccountController {
    @Autowired
    private AccountService accountService;
    @GetMapping(value = "/account/findAll")
    public ResponseEntity<?> findAll (Pageable pageable, @RequestParam(required = false) String search) {
        Page<Account> ls_Acc = accountService.getAllAccounts( pageable, search);
        return new ResponseEntity<>(ls_Acc,HttpStatus.OK);
    }

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
    @GetMapping(value = "/account/getAccountsInfoExtra")
    public List<AccountInfoExtraDTO> getAccountsInfoExtra() {
        return accountService.getAccountsInfoExtra();
    }
    @GetMapping(value = "/account/searchAccount/{age}/{skill}/{level}/{departmentId}")
    public List<Account> searchAccount(@PathVariable int age,
                                       @PathVariable String skill,
                                       @PathVariable String level,
                                       @PathVariable int departmentId) {
        return accountService.searchAccount(age, skill, level, departmentId);
    }
    @GetMapping(value = "/account/searchAccountRP")
    public List<Account> searchAccountRP(@RequestParam("age") int age,
                                         @RequestParam("skill") String skill,
                                         @RequestParam("level") String level,
                                         @RequestParam("departmentId") int departmentId) {
        return accountService.searchAccount(age, skill, level, departmentId);
    }
    @PostMapping(value = "/account/createMultiAccount")
    public List<Account> createMultiAccount(@RequestBody List<Account> accounts) {
        return accountService.createMultiAccount(accounts);
    }


}
