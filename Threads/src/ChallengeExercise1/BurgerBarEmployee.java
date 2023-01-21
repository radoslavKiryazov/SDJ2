package ChallengeExercise1;

public class BurgerBarEmployee implements Runnable {
    private String name;
    private BurgerBar bar;

    public BurgerBarEmployee(String name,BurgerBar bar){
        this.name=name;
        this.bar=bar;
    }

    @Override
    public void run() {
        while(true){
            try {
                bar.makeBurger(name);
                Thread.sleep(5000);
            } catch (InterruptedException ignored) {
            }
        }
    }

}
