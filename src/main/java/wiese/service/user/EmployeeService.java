package wiese.service.user;

import wiese.domain.user.Employee;
import wiese.service.IService;

import java.util.List;
import java.util.Set;

public interface EmployeeService extends IService<Employee, String> {
    Set<Employee> getAll();
}
