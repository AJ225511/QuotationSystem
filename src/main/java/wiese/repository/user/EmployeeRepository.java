package wiese.repository.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import wiese.domain.user.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, String> {
}
