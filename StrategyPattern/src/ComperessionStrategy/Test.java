package ComperessionStrategy;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        String filename = "TangotoNaDqvolaTutorial";
        String filename1  ="bobec";
        String filename2  ="bobi";
        String filename3  ="bobkata";
        String filename4  ="bobaka";

        List<String> files = new ArrayList<>();
        files.add(filename);
        files.add(filename1);
        files.add(filename2);
        files.add(filename3);
        files.add(filename4);
        Compressor compressor = new Compressor();
        compressor.setMethod(new SevenZCompression());
//        compressor.compress(files);
        compressor.compress(List.of("bobi","bobkata","bobec"));
    }
}
