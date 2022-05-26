package com.company.EmployeeManagement.serviceimpl;

import com.company.EmployeeManagement.model.Employee;
import com.company.EmployeeManagement.repository.EmployeeRepository;
import com.company.EmployeeManagement.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {

        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }
}
