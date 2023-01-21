package Exercise1;

public class Test
    {
        public static void main(String[] args) {
            Counter counter = new Counter();
            Thread t1 = new Thread(new Incrementer(counter));
            Thread t2 = new Thread(new Incrementer(counter));
            t1.start();
            t2.start();
        }
    }

