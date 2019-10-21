package wiese.domain.user;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Employee {
    
    @Id
    private String fname;
    private String lname;
    private String address;
    private String employeeId;

    public Employee(){}

    private Employee(Builder builder){
        this.address = builder.address;
        this.fname = builder.fname;
        this.lname = builder.lname;
        this.employeeId = builder.employeeId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getAddress() {
        return address;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public static class Builder{
        private String fname;
        private String lname;
        private String address;
        private String employeeId;

        public Builder(){}

        public Builder fname(String fname){
            this.fname = fname;
            return this;
        }

        public Builder lname(String lname){
            this.lname = lname;
            return this;
        }

        public Builder address(String address){
            this.address = address;
            return this;
        }

        public Builder employeeId(String employeeId){
            this.employeeId = employeeId;
            return this;
        }

        public Builder copy(Employee employee){
            this.employeeId(employee.getEmployeeId());
            this.address(employee.getAddress());
            this.fname(employee.getFname());
            this.lname(employee.getLname());
            return this;
        }

        @Override
        public String toString(){
            return "EmployeeBuilder{" +
                    "employeeId=" +employeeId+
                    ", address='" + address + '\'' +
                    ", fname='" + fname + '\'' +
                    ", lname='" + lname + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o){
            if(this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Builder that = (Builder) o;
            return Objects.equals(employeeId, that.employeeId) &&
                    Objects.equals(address, that.address)&&
                    Objects.equals(fname, that.fname)&&
                    Objects.equals(lname, that.lname);
        }

        @Override
        public int hashCode(){
            return Objects.hash(employeeId, address, fname, lname);
        }

        public Employee build() {
            return new Employee(this);
        }
    }
}
