package com.management.employee.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountInfoDTOimpl {
    private Integer AccountId;
    private String fullName;
    private int gender;
    private String skill;
    private String level;
    private String DepartmentName;
    private String PositionName;
}
