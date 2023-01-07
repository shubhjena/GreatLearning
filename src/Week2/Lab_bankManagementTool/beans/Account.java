package Week2.Lab_bankManagementTool.beans;

public abstract class Account {
    private double balance=0;
    private long accNum;
    static int accCount=0;
    //constructors

    public Account() {
        this.accNum = accCount++;
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
    public void setAccNum(long accNum) {
        this.accNum = accNum;
    }

    public abstract double getInterest();
    @Override
    public String toString() {
        return "Account{" +
                "Balance=" + balance +
                ", Account No=" + accNum +
                '}';
    }
}
