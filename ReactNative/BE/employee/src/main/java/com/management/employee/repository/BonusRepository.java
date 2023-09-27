package com.management.employee.repository;

import com.management.employee.entity.Bonus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface BonusRepository extends JpaRepository<Bonus,Integer>, JpaSpecificationExecutor<Bonus> {
}
