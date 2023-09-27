package com.management.employee.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="contract")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "contract_id")
    private Integer contractId;
    @Column(name = "account_id")
    private int accountId;
    @Column(name = "duration")
    private String duration;
    @Column(name = "pay_roll")
    private double payRoll;
    @Column(name = "annual")
    private double annual;
}
