package ru.andrey.vasilev.spring.boot.springbootdatarest.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.andrey.vasilev.spring.boot.springbootdatarest.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
