import java.util.Scanner;
import java.io.*;

/**
 *Show the position the word in the text
 * pat - word which  looking for
 * dfa - matrix  the length 256 and wordlength "pat"
 * lg  - array length of the text
 */
public class KMP {

    public static String pat;
    public static int[][] dfa;
    public static int[] lg;

    public static void main(String[] args) {

        System.out.println("Введите текст!");
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        System.out.println("Введите слово,которое надо найти!");
        pat = scan.nextLine();
        dfa=new int[256][pat.length()];
        lg=new int[text.length()];
        Fill fill=new Fill();
        fill.arr(pat,dfa);
        Search search=new Search();
        lg=search.show(text,pat,dfa);
        for(int i=0;i<lg.length;i++)
            if(lg[i]==1)
                System.out.print(i+" ");
        System.out.println();
    }
}

