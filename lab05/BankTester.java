package assignment05;

import java.util.Scanner;
import java.util.ArrayList;

public class BankTester{

  public static void main(String[] args){
    ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();
    accounts.add(new BankAccount(100));
    accounts.add(new BankAccount(200));
    accounts.add(new CheckingAccount(300, 5));
    accounts.add(new CheckingAccount(400, 10));
    accounts.add(new SavingsAccount(500, 0.1));
    accounts.add(new SavingsAccount(600, 0.1));


    System.out.println(accounts);

    for(BankAccount i: accounts){
      i.deposit(10.5);
    }
	System.out.println("depositting $10.5 in all accounts");
    System.out.println("\n" + accounts);

    for(int i =0;i<7;i++){
      for(BankAccount j: accounts){
        j.withdraw(5);
      }
	System.out.println("withdrawing $5 from all accounts");
    System.out.println("\n" + accounts);
    }

    ArrayList<Object> objects = new ArrayList<Object>();
    objects.add(new Double(10.5));
    objects.add("hello");
    objects.add(new BankAccount(200));
    objects.add(new CheckingAccount(300, 5));
    objects.add(new ArrayList<Integer>());
    objects.add(new int[10]);
    objects.add(new Scanner(System.in));

    System.out.println("\n" + objects);

  }


}
