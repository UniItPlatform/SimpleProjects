
public class Arch_Decompr {

    public String Decompress(String decompr_text)
    {
        char p,c;
        boolean b = false;
        int i;
        int j=1;
        String compr_text = "";
        for (i=0;i<decompr_text.length();i++)
        {
            c = decompr_text.charAt(i);
            if (c > 47 && c < 58 )
            {
                if (b)
                {
                    j = j*10 + (int)(c) - 48;
                }
                else
                {
                    j = decompr_text.charAt(i) - 48;
                    b = true;
                }
            }
            else
            {
                if (b)
                {
                    for (int k = 0;k < j;k++)
                        compr_text = compr_text + c;
                    b = false;
                }
                else
                    compr_text = compr_text + c;
            }
        }
        return compr_text;
    }
}
