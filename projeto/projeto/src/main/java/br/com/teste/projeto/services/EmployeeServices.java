package br.com.teste.projeto.services;

import java.util.List;

import br.com.teste.projeto.model.Employee;

public interface EmployeeServices {
    List<Employee> getAllEmployee();
    void save(Employee employee);
    Employee getById(Long id);
    void deleteViaId(long id);
}