package ChallengeExercise2;

public class Customer {
    private Bar bar;

    public Customer(){
        bar = new Bar();
    }
    public void takeBeer() throws InterruptedException {
        while(true){
            bar.takeBeer();
            Thread.sleep(1000);
        }
    }
}
