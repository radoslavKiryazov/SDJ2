package Exercise1;

import java.util.ArrayList;
import java.util.List;

public class Queue implements StringQueue {

private List<String> list;


public Queue(int cap){
    list = new ArrayList<>(cap);
}




    @Override
    public void enqueue(String element) {
    list.add(element);

    }

    @Override
    public String dequeue() {
        return list.remove(0);
    }

    @Override
    public String first() {
        return list.get(0);
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        if(list.size() == 0 ){
            return true;
        }
        return false;
    }

    @Override
    public int indexOf(String element) {
        return list.indexOf(element);
    }

    @Override
    public boolean contains(String element) {
        if(list.contains(element)){
            return true;
        }
        return false;
    }
}