package Week2.Lab_bankManagementTool.beans;

public class Employee {
private String name, empCode;
private long phoneNo;
    //constructor
    public Employee(String name, String empCode, long phoneNo) {
        this.name = name;
        this.empCode = empCode;
        this.phoneNo = phoneNo;
    }


    //getters & setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmpCode() {
        return empCode;
    }

    public void setEmpCode(String empCode) {
        this.empCode = empCode;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Name='" + name + '\'' +
                ", EmpCode='" + empCode + '\'' +
                ", PhoneNo=" + phoneNo +
                '}';
    }
}
