package Week2.Lab_bankManagementTool.beans;

public abstract class Account {
    private double balance=0;
    private long accNum;
    static int accCount=0;

    //constructors
    public Account() {
        this.accNum = ++accCount;
    }

    //getters & setters
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance += balance;
    }
    public long getAccNum() {
        return accNum;
    }

    public abstract double getInterest();
    @Override
    public String toString() {
        return "Balance=" + balance +
                ",\nAccount No=" + accNum;
    }
}
