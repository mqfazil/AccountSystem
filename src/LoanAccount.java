public class LoanAccount extends Account {
    private double principal;
    private double interestRate;
    LoanAccount(String _accountType, double _principal, double _interestRate) {
        this.AccountType = _accountType;
        this.principal = _principal;
        this.interestRate = _interestRate;
        this.Balance = _principal;
    }
    private double calculateInterest() {
        return this.Balance * (this.interestRate / 100);
    }
    @Override
    public boolean deposit(double _amount) {
        if (_amount <= 0) {
            System.out.println("Incorrect Amount");
            return false;
        }
        this.Balance = this.Balance - _amount;
        return true;
    }
    public void accrueInterest() {
        this.Balance += calculateInterest();
    }
    @Override
    public boolean withdraw(double _amount) {
        System.out.println("Withdrawals are not allowed on a loan account");
        return false;
    }
    @Override
    public String toString() {
        String content = "Account Type: " + this.AccountType + "\n";
        content = content + "Loan Principal: " + this.principal + "\n";
        content = content + "Interest Rate: " + this.interestRate + "%\n";
        content = content + "Current Balance (with Interest): " + this.Balance;
        return content;
    }
}
