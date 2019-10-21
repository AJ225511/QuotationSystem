package wiese.factory.user;

import wiese.domain.user.Employee;
import wiese.helper.IDGenerator;

public class EmployeeFactory {

    public static Employee buildEmployee(String fname, String lname, String address, String employeeId){
        return new Employee.Builder()
                .fname(fname)
                .lname(lname)
                .address(address)
                .employeeId(IDGenerator.generateId())
                .build();
    }
}
