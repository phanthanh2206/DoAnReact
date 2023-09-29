package com.management.employee.repository;

import com.management.employee.entity.Leave;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface LeaveRepository extends JpaRepository<Leave,Integer>, JpaSpecificationExecutor<Leave> {
    @Query(value = "select SUM(decrease) from `leave` where account_id= :id",nativeQuery = true)
    public float getTotalLeaveByAccount(@Param("id") Integer id);
}
