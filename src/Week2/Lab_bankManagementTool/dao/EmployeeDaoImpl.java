package Week2.Lab_bankManagementTool.dao;

import Week2.Lab_bankManagementTool.beans.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
    private Employee[] employee = new Employee[3];
    static private int count;

    @Override
    public boolean addNewEmployee(Employee employee) {
        if (count==3)
            throw new ArrayIndexOutOfBoundsException();
        this.employee[count] = employee;
        count++;
        return true;
    }

    @Override
    public boolean displayEmployeeInfo(String empCode) {
        for (Employee emp: employee) {
            if (empCode.equalsIgnoreCase(emp.getEmpCode())) {
                System.out.println(emp);
                return true;
            }
        }
        return false;
    }
}
