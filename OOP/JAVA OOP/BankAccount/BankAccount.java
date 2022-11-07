public class BankAccount{

  private double checkingBalance;
  private double savingsBalance;
  static int numberOfAccounts = 0;
  static double totalBalance = 0.00;

  public BankAccount(){
    checkingBalance = 0.00;
    savingsBalance = 0.00;
    numberOfAccounts++;
  }

  public void depositMoney(String account, double amount){
    if (account == "Checking"){
      checkingBalance += amount;
      totalBalance += amount;
    }else if
    (account == "Savings"){
      savingsBalance += amount;
      totalBalance += amount;
    }
}

  public void withdrawMoney(String account, double amount){
    if (account == "Checking"){
      if(checkingBalance < amount){
        System.out.println("Funds too low to withdraw");
      }
      checkingBalance -= amount;
      totalBalance -= amount;
    }else if
    (account == "Savings"){
      if(savingsBalance < amount){
        System.out.println("Funds too low to withdraw");
      }
      savingsBalance -= amount;
      totalBalance -= amount;
    }
}

public static double totalFunds(){
return totalBalance;
}


//Setters/Getters
public double getCheckingBalance(){
  return checkingBalance;
}

public double getSavingsBalance(){
  return savingsBalance;
}

public void setCheckingBalance(double checkingBalance){
  this.checkingBalance = checkingBalance;
}

public void setSavingsBalance(double savingsBalance){
  this.savingsBalance = savingsBalance;
}

    
  }



