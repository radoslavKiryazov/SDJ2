public class BlockinQueue<T> implements Buffer<T> {

    private QueueADT<T> queueADT;


    public BlockinQueue(int capacity){
        queueADT = new BoundedArrayQueue<T>(capacity);

    }


    @Override
    public synchronized void put(T element) {
        if(element == null){
            throw new IllegalArgumentException();
        }
        while(isFull()){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        queueADT.enqueue(element);
        notifyAll();
    }

    @Override
    public synchronized T take() {
        while(isEmpty()){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        T t = queueADT.dequeue();
        notifyAll();
        return t;
    }

    @Override
    public synchronized T look() {
        if(queueADT.isEmpty()){
            return null;
        } else return queueADT.first();
    }

    @Override
    public synchronized boolean isEmpty() {
        return queueADT.isEmpty();
    }

    @Override
    public boolean isFull() {
        return queueADT.isFull();
    }

    @Override
    public int size() {
        return 0;
    }
}
