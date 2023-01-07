package Week2.Lab_bankManagementTool.dao;

import Week2.Lab_bankManagementTool.beans.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
    private Employee[] employee = new Employee[3];
    static private int count;

    public EmployeeDaoImpl() {
        super();
    }

    @Override
    public boolean addNewEmployee(Employee employee) {
        if (count==3)
            throw new ArrayIndexOutOfBoundsException();
        this.employee[count] = employee;
        count++;
        return true;
    }

    @Override
    public void displayEmployeeInfo(String empCode) {
        for (int i = 0; i<count; i++) {
            if (empCode.equalsIgnoreCase(employee[i].getEmpCode()))
                System.out.println(employee[i].toString());
            else
                throw new NullPointerException();
        }
    }
}
