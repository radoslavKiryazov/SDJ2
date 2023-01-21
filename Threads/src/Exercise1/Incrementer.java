package Exercise1;


public class Incrementer implements Runnable{

    private Counter counter;


    public Incrementer(Counter counter){
        this.counter=counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000000; i++) {
            counter.incA();
            counter.incB();
            System.out.println(counter.getCountA());
            System.out.println(counter.getCountB());
        }
    }
}
