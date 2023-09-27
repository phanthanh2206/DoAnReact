package com.management.employee.repository;

import com.management.employee.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account,Integer>, JpaSpecificationExecutor<Account> {
//    @Query("SELECT * FROM account acc WHERE acc.username = :username")
//    public Account getAccountByUsername(@Param("username") String username);
}
