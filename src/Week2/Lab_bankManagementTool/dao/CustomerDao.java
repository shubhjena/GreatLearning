package Week2.Lab_bankManagementTool.dao;

import Week2.Lab_bankManagementTool.beans.Customer;

public interface CustomerDao {
    long createAccount(Customer customer);
    boolean depositMoney(long accNo, double amount);
    boolean withdrawMoney(long accNo, double amount);
    double checkBalance(long accNo);
    void viewAccountInfo(long accNo);

}
