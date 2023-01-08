package Week2.Lab_bankManagementTool.dao;

import Week2.Lab_bankManagementTool.beans.Employee;

public interface EmployeeDao {
    boolean addNewEmployee(Employee employee);
    boolean displayEmployeeInfo(String empCode);
}
