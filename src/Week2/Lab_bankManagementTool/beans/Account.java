package Week2.Lab_bankManagementTool.beans;

public class Account {
    private double balance;
    private long accNum;
    void deposit(double amount){
        this.balance+=amount;
        System.out.println("\nDeposit Successful");
    }

    void withdraw(double amount){
        this.balance -=amount;
        System.out.println("\nWithdraw Successful");
    }

    void viewBalance(){
        System.out.println("Your current balance is: "+ balance);
    }

    public long getAccNum() {
        return accNum;
    }

    public void setAccNum(long accNum) {
        this.accNum = accNum;
    }
}
