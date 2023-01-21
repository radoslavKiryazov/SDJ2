package Exercise3;

public class Program implements Runnable
{
    private String program;
    private long maxFrequency;
    private String action;
    private int count;
    private static long RUNTIME = 100000;

    public Program(String program,String action,int count){
        this.action=action;
        this.program=program;
        this.count=count;
    }

    @Override
    public void run() {
            for (int i = 0; i < count ; i++) {
                System.out.println(program +" wants to "+action);
                try {
                    Thread.sleep(RUNTIME/count);
                } catch (InterruptedException ignored) {
                }
            }
        }

    private void normalOperation(){
        System.out.println("Svirq na Kitara");
    }
}
