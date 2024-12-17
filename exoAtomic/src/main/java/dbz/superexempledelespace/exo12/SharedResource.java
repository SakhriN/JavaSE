package dbz.superexempledelespace.exo12;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SharedResource {
    Lock lock = new ReentrantLock();
    List<Integer> list;

    public SharedResource() {
        list = new ArrayList<Integer>();
    }

    public void add(Integer value) {
        boolean bool = lock.tryLock();
        if (bool) {
            lock.lock();
            list.add(value);
            lock.unlock();
        }else{
            System.out.println("Raté");
        }
    }

    public void remove(Integer value) {
        boolean bool = lock.tryLock();
        if (bool) {
            lock.lock();
            list.remove(value);
            lock.unlock();
        }else{
            System.out.println("Raté");
        }
    }

    public void show(){
        System.out.println(list);
    }

}
