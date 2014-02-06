public class ArchCompr {
    /**
     * Compress method. If is found the same symbols in a row, the number of records and symbol
     * @param comprText  text which should be compressed
     * @return compressed text
     */
    public String Compress(String comprText)
    {
        int numRepeat = 1;
        boolean repChar = false;
        char ch,prevCh;
        String decomprText = "";
        if (comprText.length()>1)
        {
            int i;
            for (i=1;i<comprText.length();i++)
            {
                prevCh = comprText.charAt(i-1);
                ch = comprText.charAt(i);
                if (ch==prevCh)
                {
                    numRepeat++;
                    repChar = true;
                }
                else
                {
                    if (repChar)
                    {
                        decomprText = decomprText + numRepeat + prevCh;
                        numRepeat = 1;
                        repChar = false;
                    }
                    else
                    {
                        decomprText = decomprText + prevCh;
                    }
                }
            }
            if (repChar)
                decomprText = decomprText + numRepeat + comprText.charAt(i-1);
            else
                decomprText = decomprText + comprText.charAt(i-1);
        }
        else
            decomprText = decomprText + comprText;
        return decomprText;
    }
}
