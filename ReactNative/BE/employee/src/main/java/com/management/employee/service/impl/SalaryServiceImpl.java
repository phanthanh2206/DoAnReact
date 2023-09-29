package com.management.employee.service.impl;

import com.management.employee.entity.Salary;
import com.management.employee.repository.BonusRepository;
import com.management.employee.repository.ContractRepository;
import com.management.employee.repository.LeaveRepository;
import com.management.employee.repository.SalaryRepository;
import com.management.employee.service.SalaryService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class SalaryServiceImpl implements SalaryService {

    private SalaryRepository salaryRepository;
    private ContractRepository contractRepository;
    private BonusRepository bonusRepository;
    private LeaveRepository leaveRepository;

    @Override
    public List<Salary> getAllSalary() {
        return salaryRepository.findAll();
    }

    @Override
    public Salary createSalary(Salary salary) {
        float payRoll=contractRepository.getPayrollByAccount(salary.getAccountId());
        float totalBonus=bonusRepository.getTotalBonusByAccount(salary.getAccountId());
        float totalLeave=leaveRepository.getTotalLeaveByAccount(salary.getAccountId());
        log.info("Payrool Info: {}",payRoll);
        log.info("Total Bonus: {}",totalBonus);
        log.info("Total Leave: {}",totalLeave);
        float actualSalary = payRoll + totalBonus - totalLeave;
        salary.setActualSalary(actualSalary);
        return salaryRepository.save(salary);
    }

    @Override
    public Salary updateSalary(Salary salary) {
        return salaryRepository.save(salary);
    }

    @Override
    public void deleteSalary(int id) {
        salaryRepository.deleteById(id);
    }
}
