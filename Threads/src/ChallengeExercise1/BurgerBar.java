package ChallengeExercise1;

public class BurgerBar {
    private int numberOfBurgers;
    private int maxNumberOfBurgers;

    public BurgerBar(int maxNumberOfBurgers){
        this.maxNumberOfBurgers=maxNumberOfBurgers;
        numberOfBurgers=0;
    }
    public synchronized void makeBurger(String employeeName) throws InterruptedException {
        if(numberOfBurgers>=maxNumberOfBurgers){
            wait();
        } else{
            numberOfBurgers++;
        }
    } public synchronized void eatBurger(String whichCustomer) throws InterruptedException {
        if(numberOfBurgers <= 0){
            wait();
        } else{
            numberOfBurgers--;
        }
    }

    public synchronized int getNumberOfBurgers() {
        return numberOfBurgers;
    }
}
