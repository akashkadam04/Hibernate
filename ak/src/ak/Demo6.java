package ak;

import java.util.*;

//public class Demo6 {
//
//	public static void main(String[] args) throws InterruptedException {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter first number :");
//		int a = sc.nextInt();
//		System.out.println("Enter second number :");
//		int b = sc.nextInt();
//		
//		for(int i=1;i<11;i++) {
//			System.out.println(a + " * " + i + " = " + a * i );
//			Thread.sleep(1000);
//		}
//		System.out.println();
//		
//		for(int i=1;i<11;i++) {
//			System.out.println(b + " * " + i + " = " + b * i );
//			Thread.sleep(2000);
//		}
//
//	}
//
//}




class BankAccount {
    private double balance;


    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
    
        try {
            if (amount > 0) {
                balance += amount;
                System.out.println(Thread.currentThread().getName() + " deposited " + amount + ". New balance: " + balance);
            }
        } finally {
          
        }
    }

    public void withdraw(double amount) {
     
        try {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.println(Thread.currentThread().getName() + " withdrawl " + amount + ". New balance: " + balance);
            } else {
                System.out.println(Thread.currentThread().getName() + " attempted to withdraw " + amount + " but insufficient funds.");
            }
        } finally {
           
        }
    }

    public void checkBalance() {
      
        try {
            System.out.println(Thread.currentThread().getName() + " Current balance is: " + balance);
        } finally {
          
        }
    }
}

class Transaction extends Thread {
    private final BankAccount account;
    private final String transactionType;
    private final double amount;

    public Transaction(BankAccount account, String transactionType, double amount) {
        this.account = account;
        this.transactionType = transactionType;
        this.amount = amount;
    }

    @Override
    public void run() {
        switch (transactionType) {
            case "DEPOSIT":
                account.deposit(amount);
                break;
            case "WITHDRAW":
                account.withdraw(amount);
                break;
            case "CHECK_BALANCE":
                account.checkBalance();
                break;
        }
    }
}

public class Demo6 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);

        Thread t1 = new Transaction(account, "DEPOSIT", 500);
        Thread t2 = new Transaction(account, "WITHDRAW", 200);
        Thread t3 = new Transaction(account, "CHECK_BALANCE", 0);
        Thread t4 = new Transaction(account, "WITHDRAW", 1500);

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All transactions completed.");
    }
}




//
//class Bus {
//    private final String busNumber;
//    private final int totalSeats;
//    private final List<Integer> bookedSeats;
//
//    public Bus(String busNumber, int totalSeats) {
//        this.busNumber = busNumber;
//        this.totalSeats = totalSeats;
//        this.bookedSeats = new ArrayList<>();
//    }
//
//    public String getBusNumber() {
//        return busNumber;
//    }
//
//    public int getTotalSeats() {
//        return totalSeats;
//    }
//
//    public synchronized boolean bookSeat(int seatNumber) {
//        if (bookedSeats.contains(seatNumber)) {
//            return false; 
//        }
//        if (seatNumber > totalSeats || seatNumber < 1) {
//            return false; 
//        }
//        bookedSeats.add(seatNumber);
//        return true;
//    }
//
//    public synchronized List<Integer> getBookedSeats() {
//        return new ArrayList<>(bookedSeats);
//    }
//}
//
//class Passenger implements Runnable {
//    private final String name;
//    private final Bus bus;
//    private final int seatNumber;
//
//    public Passenger(String name, Bus bus, int seatNumber) {
//        this.name = name;
//        this.bus = bus;
//        this.seatNumber = seatNumber;
//    }
//
//    @Override
//    public void run() {
//        synchronized (bus) {
//            if (bus.bookSeat(seatNumber)) {
//                System.out.println("Passenger " + name + " successfully booked seat " + seatNumber + " on bus " + bus.getBusNumber());
//            } else {
//                System.out.println("Passenger " + name + " failed to book seat " + seatNumber + " on bus " + bus.getBusNumber());
//            }
//        }
//    }
//}













































