package emp.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import emp.api.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository <Employee, Long>{
	
	Employee findById(@Param("id") long Id);

}
