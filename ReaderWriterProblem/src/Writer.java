public class Writer implements Runnable {

    private ReadersPreferenceReadWrite rpr;
private int milSecs;



    public Writer(ReadersPreferenceReadWrite rpr, int milSecs){
        this.rpr = rpr;
        this.milSecs = milSecs;
    }

    @Override
    public void run() {
        rpr.acquireWrite();
        try {
            Thread.sleep(1000);
            rpr.doWrite();
            System.out.println("Hey I wrote");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        rpr.releaseWrite();

    }
}
