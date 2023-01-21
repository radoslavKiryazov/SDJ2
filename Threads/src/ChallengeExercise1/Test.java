package ChallengeExercise1;

public class Test
{
    public static void main(String[] args) {
        BurgerBar bar = new BurgerBar(10);
        BurgerBarEmployee employee = new BurgerBarEmployee("Donchev",bar);
        BurgerBarEmployee employee1 = new BurgerBarEmployee("Sasata",bar);

        BurgerBarCustomer customer1 = new BurgerBarCustomer("Bozhidar",bar,1);
        BurgerBarCustomer customer2 = new BurgerBarCustomer("Alexander",bar,1);
        BurgerBarCustomer customer3 = new BurgerBarCustomer("Tony",bar,1);
        BurgerBarCustomer customer4 = new BurgerBarCustomer("Radoslav",bar,1);
        BurgerBarCustomer customer5 = new BurgerBarCustomer("Habibi",bar,1);
        
    }
}
