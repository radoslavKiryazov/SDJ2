package Exercise4;


public class Test {
    public static void main(String[] args) {
        Counter counter = new Counter(10,1000);
        Thread counterInc = new Thread(new CounterIncrementer(counter,200));
        Thread counterInc1 = new Thread(new CounterIncrementer(counter,200));
        Thread counterDec  = new Thread(new CounterDecrementer(200,counter));
        Thread counterDec1  = new Thread(new CounterDecrementer(200,counter));
        counterInc.setName("Counter Incrementer Number 1");
        counterInc1.setName("Counter Incrementer Number 2");
        counterDec.setName("Counter Decrementer Number 1");
        counterDec1.setName("Counter Decrementer Number 2");
        counterInc.start();
        counterInc1.start();
        counterDec.start();
        counterDec1.start();}
}
