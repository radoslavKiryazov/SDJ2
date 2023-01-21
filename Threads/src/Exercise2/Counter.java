package Exercise2;
import java.util.concurrent.locks.Lock;
        import java.util.concurrent.locks.ReentrantLock;

public class Counter
{
    private int count;
    private Lock lock = new ReentrantLock();

    public void inc() throws InterruptedException {
        if(lock.tryLock()){
            count++;
            lock.unlock();
        } else {
            Thread.sleep(1);
            inc();
        }
    }
    public synchronized int get(){
        return count;
    }
}

