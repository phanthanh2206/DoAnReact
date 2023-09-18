package com.management.employee.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="bonus")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bonus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bonus_id")
    private Integer bonusId;
    @Column(name = "account_id")
    private int accountId;
    @Column(name = "reason")
    private String reason;
}
