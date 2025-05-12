package br.com.teste.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.teste.projeto.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
 
}
