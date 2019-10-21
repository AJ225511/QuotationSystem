package wiese.controller.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import wiese.domain.user.Employee;
import wiese.service.user.impl.EmployeeServiceImpl;

import java.util.Set;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/quotationsystem/lookup/employee")
public class EmployeeController {
    @Autowired
    @Qualifier("EmployeeServiceImpl")
    private EmployeeServiceImpl employeeService;

    @PostMapping("/new")
    public Employee create(@RequestBody Employee employee){

        return employeeService.create(employee);
    }

    @GetMapping(path = "/find/{id}")
    public Employee findById(@PathVariable String id){

        Employee account = employeeService.read(id);
        return account;
    }

    @PutMapping("/update")
    public void update(@RequestBody Employee account){

        employeeService.update(account);

    }

    @DeleteMapping(path = "/delete/{id}")
    public void delete(@PathVariable String id){
        employeeService.delete(id);
    }

    @GetMapping("/getall")
    public Set<Employee> getAll(){
        return employeeService.getAll();
    }


}
