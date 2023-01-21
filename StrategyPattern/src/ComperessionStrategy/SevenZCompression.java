package ComperessionStrategy;

public class SevenZCompression implements CompressionMethod {
    @Override
    public String compression(String fileName) {
        System.out.print("File is Compressing...");
        return fileName +".7zip";
    }
}
