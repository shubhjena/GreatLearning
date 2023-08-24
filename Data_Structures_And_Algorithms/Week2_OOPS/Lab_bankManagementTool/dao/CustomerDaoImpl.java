package Week2_OOPS.Lab_bankManagementTool.dao;

import Week2_OOPS.Lab_bankManagementTool.beans.Customer;

public class CustomerDaoImpl implements CustomerDao {

    private final Customer[] customer = new Customer[10];
    private static int  count=0;

    public CustomerDaoImpl() {
        super();
    }

    @Override
    public long createAccount(Customer customer) {
        if (count==10)
            throw new ArrayIndexOutOfBoundsException();
        this.customer[count] = customer;
        count++;
        return customer.getAccount().getAccNum();
    }

    @Override
    public boolean depositMoney(long accNo, double amount) {
        for (Customer c: customer) {
            if(accNo == c.getAccount().getAccNum()) {
                c.getAccount().setBalance(amount);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean withdrawMoney(long accNo, double amount) {
        for (Customer c: customer) {
            if(accNo == c.getAccount().getAccNum()) {
                c.getAccount().setBalance(amount*(-1));
                return true;
            }
        }
        return false;
    }

    @Override
    public double checkBalance(long accNo) {
        for (Customer c: customer) {
            if(accNo == c.getAccount().getAccNum())
                return c.getAccount().getBalance();
        }
        throw new AccountNotFound("Account does not exist!");
    }

    @Override
    public boolean viewAccountInfo(long accNo) {
        for (Customer c: customer) {
            if(accNo == c.getAccount().getAccNum()) {
                System.out.println(c);
                return true;
            }
        }
        throw new AccountNotFound("Account does not exist!");
    }
}
