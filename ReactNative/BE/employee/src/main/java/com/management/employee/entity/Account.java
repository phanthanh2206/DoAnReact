package com.management.employee.entity;

import com.management.employee.entity.enums.Role;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Entity
@Table(name="account_detail")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "account_id")
    private Integer accountId;
    @Column(name = "full_name")
    private String fullName;
    @Column(name = "age")
    private int age;
    @Column(name = "gender")
    private int gender;
    @Column(name = "address")
    private String address;
    @Column(name = "dob")
    private String dob;
    @Column(name = "skill")
    private String skill;
    @Column(name = "level")
    private String level;
    @Column(name = "department_id")
    private int departmentId;
    @Column(name = "position_id")
    private int positionId;
}
