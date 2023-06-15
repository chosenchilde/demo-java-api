package chosenchilde.demoapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import chosenchilde.model.Employe;

public interface EmployeRepository extends JpaRepository<Employe, Long> {
}