public class Reader implements Runnable{


    private ReadersPreferenceReadWrite rpr;
    private int milSecs;
    public Reader(ReadersPreferenceReadWrite rpr,int milSecs) {
        this.rpr = rpr;
        this.milSecs = milSecs;
    }

    @Override
    public void run() {
        rpr.acquireRead();
        try {
            Thread.sleep(milSecs);
            rpr.doRead();
            System.out.println("I read that");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        rpr.releaseRead();

    }
}
