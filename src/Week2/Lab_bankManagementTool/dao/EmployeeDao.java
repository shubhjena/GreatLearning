package Week2.Lab_bankManagementTool.dao;

import Week2.Lab_bankManagementTool.beans.Employee;

public interface EmployeeDao {
    public boolean addNewEmployee(Employee employee);
    public void displayEmployeeInfo(String empCode);
}
