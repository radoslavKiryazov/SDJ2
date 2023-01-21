package ChallengeExercise2;

public class Bartender {

    private Bar bar;

    private Bartender(){
        bar = new Bar();
    }
    public void makeBeer() throws InterruptedException {
        while(true){
            bar.placeBeer();
            Thread.sleep(1000);
        }
    }
}
