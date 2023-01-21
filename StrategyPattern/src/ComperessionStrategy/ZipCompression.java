package ComperessionStrategy;

public class ZipCompression implements CompressionMethod{
    @Override
    public String compression(String fileName) {
        System.out.print("File is compressing...");
        return fileName +".rar";
    }
}
