package Exercise4;

public class Counter {
    private long value;
    private long max;
    private long min;


    public Counter(long min,long max){
        this.value=0;
        this.max=max;
        this.min=min;
    }
    public synchronized void increment() throws InterruptedException {
        value++;
        System.out.println(value + ": " + Thread.currentThread().getName());
        if(value>=max){
            Thread.sleep(1000);
        }
    }
    public synchronized void decrement() throws InterruptedException {
        value--;
        System.out.println(value + ": " + Thread.currentThread().getName());
        if(value<=min){
            Thread.sleep(1000);
        }
    }

    public synchronized long getValue() {
        return value;
    }
}
