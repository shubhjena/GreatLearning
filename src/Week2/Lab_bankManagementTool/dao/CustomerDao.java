package Week2.Lab_bankManagementTool.dao;

import Week2.Lab_bankManagementTool.beans.Customer;

public interface CustomerDao {
    public boolean createAccount(Customer customer);
    public boolean depositMoney(long accNo, double amount);
    public boolean withdrawMoney(long accNo, double amount);
    public double checkBalance(long accNo);
    public void viewAccountInfo(long accNo);

}
