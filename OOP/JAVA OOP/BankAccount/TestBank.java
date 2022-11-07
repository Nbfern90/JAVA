public class TestBank{
  public static void main(String[] args){

    BankAccount account1 = new BankAccount();

    account1.depositMoney("Checking",50.00);
    account1.depositMoney("Savings",50.00);
    account1.withdrawMoney("Checking",25.00);
    System.out.println(account1.getCheckingBalance());
    System.out.println(account1.getSavingsBalance());
    System.out.println(BankAccount.totalFunds());


  }
}