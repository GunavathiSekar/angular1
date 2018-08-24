package com.kg.librarySpringBoot.repository;
import com.kg.librarySpringBoot.model.Employee;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}