import java.util.Scanner;

/**
 *Enter the operation you want to perform and execute the method Compress or Decompress
 */
public class Archivator {

    public static String change_text;

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
            Arch_Compr Arch_c = new Arch_Compr();
            change_text = Arch_c.Compress(text);
        }
        else
            if(oper.equals("Decompress"))
            {
                System.out.println("Enter the text!");
                Scanner scan2 = new Scanner(System.in);
                String text = scan2.nextLine();
                Arch_Decompr Arch_d = new Arch_Decompr();
                change_text = Arch_d.Decompress(text);
            }
            else
            {
                System.out.println("You have entered an incorrect operation!");
                System.exit(0);
            }
        System.out.println(change_text);
    }
}
