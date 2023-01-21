package Exercise2;

public class Incrementer implements Runnable{

    private Counter counter;


    public Incrementer(Counter counter){
        this.counter=counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                counter.inc();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(counter.get());
        }
    }
}
