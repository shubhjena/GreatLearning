package Week2_OOPS.Lab_bankManagementTool.dao;

import Week2_OOPS.Lab_bankManagementTool.beans.Employee;

public interface EmployeeDao {
    boolean addNewEmployee(Employee employee);
    boolean displayEmployeeInfo(String empCode);
}
