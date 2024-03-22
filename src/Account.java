public abstract class Account {
    protected String AccountType;
    protected double Balance;
    public abstract boolean withdraw(double amount);
    public abstract boolean deposit (double amount);

    @Override
    public String toString() {
        String content = "";
        content = content + "The Account Type is: " + this.AccountType + "\n";
        content = content + "The Account Balance is: " + this.Balance;
        return content;
    }
}