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
    @Column(name = "actual_salary")
    private double actualSalary;
    @Column(name = "pay_date")
    private Instant payDate;
    @Column(name = "leave_id")
    private int leaveId;
    @Column(name = "bonus_id")
    private int bonusId;
}
