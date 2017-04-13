package assignment05;

//obviously it says that other random stuff before and after
//greeter:
//"Entering Greeter::sayHi"
//"Hello, Bob."
//"Exitting Greeter::sayHi"

//inquisitivegreeter:
//"Entering InquisitiveGreeter::sayHi"
//"Entering Greeter::sayHi"
//"Hello, Bob."
//"Exitting Greeter::sayHi"
//"How are you, Bob."
//"Exitting InquisitiveGreeter::sayHi"

public class SavingsAccount extends BankAccount{
  private double rate;

  public SavingsAccount(double balance, double rate){
    super(balance);
    this.rate = rate;
  }
  @Override
  public void deposit(double balance){
    super.deposit(balance+balance*rate);
  }
  public double getRate(){
    return rate;
  }
  public String toString(){
    return super.toString() + " @ " + rate*100 + "%";
  }
}
