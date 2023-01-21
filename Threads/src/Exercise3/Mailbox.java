package Exercise3;

public class Mailbox implements Runnable{

    private long maxFrequency;
    private int count;
    private static long RUNTIME = 100000;

    public Mailbox(int count){
        this.count=count;
    }



    @Override
    public void run() {
        for (int i = 0; i < count ; i++) {
            System.out.println("New Mail In Your Mailbox....");
            try {
                Thread.sleep(RUNTIME/count);
            } catch (InterruptedException ignored) {
            }
        }
    }
}
