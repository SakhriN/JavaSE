package dbz.superexempledelespace.exo2;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

public class Thread1 implements Callable<AtomicInteger> {
private AtomicInteger counter;
private AtomicInteger compteur;


    public Thread1(AtomicInteger counter) {
        this.compteur = new AtomicInteger(0);
        this.counter = counter;
    }

    public AtomicInteger call() {

        counter.incrementAndGet();
        compteur.incrementAndGet();
        System.out.println("thread1: ");
    return counter;
    }

    public AtomicInteger getCompteur() {
        return compteur;
    }
}
