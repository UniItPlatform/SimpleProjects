public class ArchCompr {
    /**
     * Compress method. If is found the same symbols in a row, the number of records and symbol
     * @param ComprText  text which should be compressed
     * @return compressed text
     */
    public String Compress(String ComprText)
    {
        int NumRepeat = 1;
        boolean RepChar = false;
        char ch,PrevCh;
        String DecomprText = "";
        if (ComprText.length()>1)
        {
            int i;
            for (i=1;i<ComprText.length();i++)
            {
                PrevCh = ComprText.charAt(i-1);
                ch = ComprText.charAt(i);
                if (ch==PrevCh)
                {
                    NumRepeat++;
                    RepChar = true;
                }
                else
                {
                    if (RepChar)
                    {
                        DecomprText = DecomprText + NumRepeat + PrevCh;
                        NumRepeat = 1;
                        RepChar = false;
                    }
                    else
                    {
                        DecomprText = DecomprText + PrevCh;
                    }
                }
            }
            if (RepChar)
                DecomprText = DecomprText + NumRepeat + ComprText.charAt(i-1);
            else
                DecomprText = DecomprText + ComprText.charAt(i-1);
        }
        else
            DecomprText = DecomprText + ComprText;
        return DecomprText;
    }
}
