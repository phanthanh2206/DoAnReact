package com.management.employee.repository;

import com.management.employee.dto.AccountInfoDTO;
import com.management.employee.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRepository extends JpaRepository<Account,Integer>, JpaSpecificationExecutor<Account> {
//    @Query("SELECT * FROM account acc WHERE acc.username = :username")
//    public Account getAccountByUsername(@Param("username") String username);
    @Query(value = "select ad.account_id as AccountId,ad.full_name as fullName,ad.gender,ad.skill,ad.`level`,dep.department_name as DepartmentName,pos.position_name as PositionName\n" +
            "from account_detail ad \n" +
            "inner join department dep on ad.department_id = dep.department_id\n" +
            "inner join `position` pos on ad.position_id = pos.position_id",nativeQuery = true)
    public List<AccountInfoDTO> getAccountInfo();
}
