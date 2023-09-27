package com.management.employee.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Entity
@Table(name="salary")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Salary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "salary_id")
    private Integer salaryId;
    @Column(name = "account_id")
    private Integer accountId;
    @Column(name = "actual_salary")
    private float actualSalary;
    @Column(name = "bank_name")
    private String bankName;
    @Column(name = "bank_no")
    private long bankNo;
}
