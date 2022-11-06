package advanced.threads.bankAccount;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account = new BankAccount("IBAN123456789", 1000.0d);
        Thread t1 = new Thread(){
            @Override
            public void run() {
                for(int i = 0; i < 10000; i++){account.deposit(2);}
            }
        };
        Thread t2 = new Thread(){
            @Override
            public void run() {
                for(int i = 0; i < 10000; i++){account.withdraw(0);}
            }
        };
        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        }catch(Exception e){e.printStackTrace();}

        account.seeBalance();

        System.out.println("Enter amount you want to deposit : ");
        account.deposit(scanner.nextDouble());
        account.seeBalance();

    }
}


















/*
public class Main {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount("IBAN123456789",1000.0d);

        Thread t1 = new Thread(){
            @Override
            public void run() {
                for(int i = 0 ; i <=10000 ; i++){bankAccount.deposit(1);}
            }
        };
        Thread t2 = new Thread(){public void run() {
            for(int i = 0 ; i <=10000 ; i++){bankAccount.withDraw(1);
            }
        }
        };

        t1.start();
        t2.start();
        try{t1.join();t2.join();}catch(Exception e){e.printStackTrace();}

        bankAccount.seeBalance();

        System.out.print("Enter amount for deposit : ");
        Scanner scanner = new Scanner(System.in);
        bankAccount.deposit(scanner.nextDouble());
        //System.out.println("Current Balance : " );
        bankAccount.seeBalance();

    }
}
*/