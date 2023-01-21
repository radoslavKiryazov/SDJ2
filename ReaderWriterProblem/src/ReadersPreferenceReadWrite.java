public class ReadersPreferenceReadWrite {
    private int activeReaders, writers, waitingReaders, sharedData;

    public ReadersPreferenceReadWrite(){
        activeReaders = 0;
        writers = 0;
        waitingReaders = 0;
        sharedData = 0;
    }
    public synchronized void acquireRead(){
        waitingReaders++;
        while (writers > 0){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        waitingReaders--;
        activeReaders++;
    }
    public synchronized void releaseRead(){
        activeReaders--;
        if(activeReaders == 0){
            notify();
        }
    }
    public synchronized void acquireWrite(){
        while(activeReaders >0 || writers > 0 || waitingReaders > 0){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            writers++;
        }
    }

    public synchronized void releaseWrite(){
        writers--;
        notify();
    }

    public void doWrite(){
        sharedData++;
    }
    public int doRead(){
        return sharedData;
    }


}