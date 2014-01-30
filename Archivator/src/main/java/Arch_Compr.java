
public class Arch_Compr {

    /**
     * Compress method. If is found the same symbols in a row, the number of records and symbol
     * @param compr_text  text which should be compressed
     * @return compressed text
     */
    public String Compress(String compr_text)
    {
        int i,j = 1;
        boolean b = false;
        char c,p;
        String decompr_text = "";
        if (compr_text.length()>1)
        {
            for (i=1;i<compr_text.length();i++)
            {
                p = compr_text.charAt(i-1);
                c = compr_text.charAt(i);
                if (c==p)
                {
                    j++;
                    b = true;
                }
                else
                {
                    if (b)
                    {
                        decompr_text = decompr_text + j + p;
                        j = 1;
                        b = false;
                    }
                    else
                    {
                        decompr_text = decompr_text + p;
                    }
                }
            }
            if (b)
                decompr_text = decompr_text + j + compr_text.charAt(i-1);
            else
                decompr_text = decompr_text + compr_text.charAt(i-1);
        }
        else
            decompr_text = decompr_text + compr_text;
        return decompr_text;
    }
}
