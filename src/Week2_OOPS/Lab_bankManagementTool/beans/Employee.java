package Week2_OOPS.Lab_bankManagementTool.beans;

public class Employee {
private final String name, empCode;
private final long phoneNo;
    //constructor
    public Employee(String name, String empCode, long phoneNo) {
        this.name = name;
        this.empCode = empCode;
        this.phoneNo = phoneNo;
    }
    public String getEmpCode() {
        return empCode;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "\nName='" + name + '\'' +
                ",\nEmpCode='" + empCode + '\'' +
                ",\nPhoneNo=" + phoneNo +
                '}';
    }
}
