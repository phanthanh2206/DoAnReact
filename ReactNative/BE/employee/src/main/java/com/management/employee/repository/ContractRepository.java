package com.management.employee.repository;

import com.management.employee.entity.Contract;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface ContractRepository extends JpaRepository<Contract,Integer>, JpaSpecificationExecutor<Contract> {
}
