public class CreditAccount extends Account{
    private double CreditLimit;
    CreditAccount(String _accountType, double _creditLimit) {
        this.AccountType = _accountType;
        this.Balance = 0;
        this.CreditLimit = _creditLimit;
    }
    public void setCreditLimit(double _creditLimit){
        CreditLimit = _creditLimit;
    }

    @Override
    public boolean deposit(double _amount) {
        if (this.Balance <= 0){
            this.Balance = 0;
            System.out.println("Sorry! No Balance to pay");
            return false;
        }
        else if (this.Balance < _amount) {
            System.out.println("The balance is less than the amount you are trying to pay");
            System.out.println(this.toString());
        }
        else{
            this.Balance = this.Balance - _amount;
        }
        return false;
    }

    @Override
    public boolean withdraw(double _amount) {
        if ((this.CreditLimit - this.Balance) >= _amount){
            this.Balance = this.Balance +_amount;
        }
        else{
            System.out.println("The amount is greater than the remaining balance");
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        String content = "Remaining Fund: " + (this.CreditLimit - this.Balance) + "\r\n";
        content = content + super.toString();
        return content;
    }
}
