import java.util.Scanner;

public class ArchivatorTest {

    public static void main(String[] args) {
        String text = "qqqwerrtyyyrttt";
        System.out.println(text);
        System.out.println("Compress");
        ArchComprTest archCTest = new ArchComprTest();
        System.out.println(archCTest.CompressTest(text));
        System.out.println();
        text = "4rt7eyr3i11d";
        System.out.println(text);
        System.out.println("Decompress");
        ArchDecomprTest archDTest = new ArchDecomprTest();
        System.out.println(archDTest.DecompressTest(text));
    }
}
