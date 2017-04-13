package assignment05;

public class BankAccount{
  private double balance;
  private int idNum;
  private static int numAccounts = 0;

  public BankAccount(double balance){
    if(balance<0)
      throw new IllegalArgumentException();
    this.balance = balance;
    idNum = numAccounts;
    numAccounts++;
  }
  public int getIdNum(){
    return idNum;
  }
  public double getBalance(){
    return balance;
  }
  @Override
  public String toString(){
    return "Acct. #" + idNum + " has $" + balance;
  }
  public void deposit(double amount){
    balance+=amount;
  }
  public double withdraw(double amount){
    if(amount>balance){
      balance = 0;
      return balance;
    }
    else if(amount>0){
      balance-=amount;
      return amount;
    }
    else{
      return -1;
    }
  }

}
