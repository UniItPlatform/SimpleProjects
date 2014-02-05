import java.util.Scanner;

public class ArchivatorTest {

    public static void main(String[] args) {
        String text = "qqqwerrtyyyrttt";
        System.out.println(text);
        System.out.println("Compress");
        ArchComprTest ArchCTest = new ArchComprTest();
        System.out.println(ArchCTest.CompressTest(text));
        System.out.println();
        text = "4rt7eyr3i11d";
        System.out.println(text);
        System.out.println("Decompress");
        ArchDecomprTest ArchDTest = new ArchDecomprTest();
        System.out.println(ArchDTest.DecompressTest(text));
    }
}
