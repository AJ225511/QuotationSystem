package wiese.service.user.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wiese.domain.user.Employee;
import wiese.repository.user.EmployeeRepository;
import wiese.service.user.EmployeeService;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service("EmployeeServiceImpl")
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeServiceImpl service = null;
    @Autowired
    private EmployeeRepository repository;

    public EmployeeServiceImpl getService(){

        if(service == null){
            return new EmployeeServiceImpl();
        }
        return service;
    }

    @Override
    public Set<Employee> getAll(){
        List<Employee> list = (List<Employee>) repository.findAll();
        return new HashSet<>(list);
    }

    @Override
    public Employee create(Employee employee){
        return repository.save(employee);
    }

    @Override
    public Employee read(String s){
        return repository.findById(s).orElse(null);
    }

    @Override
    public Employee update(Employee employee){
        return repository.save(employee);
    }

    @Override
    public void delete(String s){
        repository.deleteById(s);
    }
}

