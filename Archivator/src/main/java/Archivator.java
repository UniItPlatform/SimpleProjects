import java.util.Scanner;

/**
 *Enter the operation you want to perform and execute the method Compress or Decompress
 */
public class Archivator {

    public static String ChangeText;

    public static void main(String[] args) {
        System.out.println("1.Compress");
        System.out.println("2.Decompress");
        System.out.println("Enter the operation you want to perform!");
        Scanner Scan1 = new Scanner(System.in);
        String Oper = Scan1.nextLine();
        if(Oper.equals("Compress"))
        {
            System.out.println("Enter the text!");
            Scanner Scan2 = new Scanner(System.in);
            String text = Scan2.nextLine();
            ArchCompr ArchC = new ArchCompr();
            ChangeText = ArchC.Compress(text);
        }
        else
            if(Oper.equals("Decompress"))
            {
                System.out.println("Enter the text!");
                Scanner Scan2 = new Scanner(System.in);
                String text = Scan2.nextLine();
                ArchDecompr ArchD = new ArchDecompr();
                ChangeText = ArchD.Decompress(text);
            }
            else
            {
                System.out.println("You have entered an incorrect operation!");
                System.exit(0);
            }
        System.out.println(ChangeText);
    }
}
