package Exercise4;

public class CounterDecrementer implements Runnable {

    private int updates;
    private Counter counter;

public CounterDecrementer(int updates,Counter counter){
    this.counter=counter;
    this.updates=updates;
}

    @Override
    public void run() {
        for (int i = 0; i < updates ; i++) {

            for (int j = 0; j < updates ; j++) {
                try {
                    counter.decrement();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(counter.getValue());
            }
        }

    }
}
