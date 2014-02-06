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
        Scanner scan1 = new Scanner(System.in);
        String oper = scan1.nextLine();
        if(oper.equals("Compress"))
        {
            System.out.println("Enter the text!");
            Scanner scan2 = new Scanner(System.in);
            String text = scan2.nextLine();
            ArchCompr archC = new ArchCompr();
            ChangeText = archC.Compress(text);
        }
        else
            if(oper.equals("Decompress"))
            {
                System.out.println("Enter the text!");
                Scanner scan2 = new Scanner(System.in);
                String text = scan2.nextLine();
                ArchDecompr archD = new ArchDecompr();
                ChangeText = archD.Decompress(text);
            }
            else
            {
                System.out.println("You have entered an incorrect operation!");
                System.exit(0);
            }
        System.out.println(ChangeText);
    }
}
