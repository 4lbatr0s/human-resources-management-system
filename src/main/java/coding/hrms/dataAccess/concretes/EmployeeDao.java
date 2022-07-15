package coding.hrms.dataAccess.concretes;

import coding.hrms.entities.concretes.Employee;
import coding.hrms.entities.concretes.Employer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeDao extends JpaRepository<Employee, Integer> {
}


