package com.GestionEmploi.Services;

import java.util.List;

import com.GestionEmploi.entities.Employee;

public interface EmployeeService {
void createEmployee(Employee e); 
List<Employee> getEmployees();
Employee getOneEmployee(long id);	

}
