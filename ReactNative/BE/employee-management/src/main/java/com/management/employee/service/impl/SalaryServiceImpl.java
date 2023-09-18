package com.management.employee.service.impl;

import com.management.employee.entity.Salary;
import com.management.employee.repository.SalaryRepository;
import com.management.employee.service.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalaryServiceImpl implements SalaryService {
    @Autowired(required=true)
    private SalaryRepository salaryRepository;

    @Override
    public List<Salary> getAllSalary() {
        return salaryRepository.findAll();
    }

    @Override
    public Salary createSalary(Salary salary) {
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
