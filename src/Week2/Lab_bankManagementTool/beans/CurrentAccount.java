package Week2.Lab_bankManagementTool.beans;

public class CurrentAccount extends Account{
    private final double interest = 0;
    @Override
    public double getInterest() {
        return interest;
    }
}
