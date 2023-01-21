package ChallengeExercise1;

public class BurgerBarCustomer implements Runnable{
    private String name;
    private int burgersToEat;
    private BurgerBar bar;

    public BurgerBarCustomer(String name,BurgerBar bar,int burgersToEat){
     this.name=name;
     this.bar=bar;
     this.burgersToEat=burgersToEat;
    }



    @Override
    public void run() {
        for (int i = 0; i < burgersToEat ; i++) {
            try {
                bar.eatBurger(name);
            } catch (InterruptedException ignored) {
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ignored) {
            }
        }
    }
}
