public class Main {
    public static void main(String[] args) {
        Account act = new DebitAccount("Debit",500);
        System.out.println(act.toString());
        act.deposit(50);
        System.out.println(act.toString());
        act.withdraw(600);
        System.out.println(act.toString());

        Account act2 = new CreditAccount("Credit",1500);
        act2.withdraw(200);
        System.out.println(act2.toString());
        act2.withdraw(2000);
        System.out.println(act2.toString());

        Account act3 = new LoanAccount("Loan", 8500,6);
        System.out.println(act3.toString());
        act3.withdraw(300);
        System.out.println(act3.toString());
        act3.deposit(1000);
        System.out.println(act3.toString());
    }
}