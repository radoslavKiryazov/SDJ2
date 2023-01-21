package Exercise0;

public class Counter
{
    private int count;

    public synchronized void inc(){
        count++;
    }
    public synchronized int getCount(){
        return count;
    }
}
