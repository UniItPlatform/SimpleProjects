import java.util.Scanner;


public class KMP {

    public static String pat;
    public static int[][] dfa;
    public static int[] lg;

    public static void main(String[] args) {

        System.out.println("Введите текст!");
        Scanner scan = new Scanner(System.in);
        String txt = scan.nextLine();
        System.out.println("Введите слово,которое надо найти!");
        pat = scan.nextLine();
        //Создаем массивы
        dfa=new int[256][pat.length()];
        lg=new int[txt.length()];
        //Вызываем функции
        Fill fill=new Fill();
        fill.arr(pat,dfa);
        Search search=new Search();
        lg=search.show(txt,pat,dfa);
        //Вывод на экран
        for(int i=0;i<lg.length;i++)
            if(lg[i]==1)
                System.out.print(i+" ");
        System.out.println();
    }
}

