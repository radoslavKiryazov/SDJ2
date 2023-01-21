package ChallengeExercise2;

import java.util.ArrayList;
import java.util.List;

public class Bar implements Runnable {
    private List<Beer> beers;
    private int maxBeers;
    private boolean isOpen;

    public Bar() {
        this.maxBeers = 20;
        beers = new ArrayList<>();
        isOpen = true;
    }

    public void placeBeer() throws InterruptedException {
        if (isOpen) {
            if (beers.size() > maxBeers) {
                wait();
            } else {
                beers.add(new Beer());
                notifyAll();
            }
        }
    }

    public void takeBeer() {
        if (isOpen) {
            if (beers.size() > 0) {
                beers.remove(0);
            }
        }
    }

    @Override
    public void run() {
        try {
            wait(10000);
        } catch (InterruptedException ignored) {
        }
        isOpen = false;
    }
}

