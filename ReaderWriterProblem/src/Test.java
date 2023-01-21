public class Test {
    public static void main(String[] args) {
        ReadersPreferenceReadWrite  rdpr = new ReadersPreferenceReadWrite();

        Writer w1 = new Writer(rdpr,1000);
        Writer w2 = new Writer(rdpr,1000);

        Reader r1 = new Reader(rdpr,1000);
        Reader r2 = new Reader(rdpr,1000);

        Thread writer1 = new Thread(w1);
        writer1.start();

        Thread writer2 = new Thread(w2);
        writer2.start();


        Thread reader1 = new Thread(r1);
        reader1.start();

        Thread reader2 = new Thread(r2);
        reader2.start();
    }
}
