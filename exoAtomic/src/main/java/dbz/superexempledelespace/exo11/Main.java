package dbz.superexempledelespace.exo11;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    private static final Object lock = new Object();
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(100);
        Thread[] threads = new Thread[3];



        for (int i = 0; i < threads.length; i++) {
            System.out.println(threads.length);
            int finalI = i;
            synchronized (lock){
                threads[i] = new Thread(() -> {
                    for(int j = 0; j < 5; j++) {
                        int randomAction = new Random().nextInt(2);
                        int randomMontant = new Random().nextInt(100);
                        if(randomAction==1){
                            bankAccount.deposit(randomMontant);
                        }else{
                            bankAccount.withdraw(randomMontant);
                        }
                    }
                });
            }
        }
        for (int i = 0; i < threads.length-1; i++) {
            for(int j = 0; j < 5; j++) {
                int finalJ = j;
                threads[finalJ].start();
            }
        }
    }
}
