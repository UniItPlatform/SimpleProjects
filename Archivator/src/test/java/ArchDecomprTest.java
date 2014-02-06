
public class ArchDecomprTest {
    /**
     * Decompress method. if is found number - N, N is recorded after the number of characters
     * @param decomprText text which should be decompressed
     * @return Decompressed text
     */
    public String DecompressTest(String decomprText)
    {
        char ch;
        boolean repChar = false;
        int numRepeat=1;
        String comprText = "";
        for (int i=0;i<decomprText.length();i++)
        {
            ch = decomprText.charAt(i);
            if (ch > 47 && ch < 58 )
            {
                if (repChar)
                {
                    numRepeat = numRepeat*10 + (int)(ch) - 48;
                }
                else
                {
                    numRepeat = decomprText.charAt(i) - 48;
                    repChar = true;
                }
            }
            else
            {
                if (repChar)
                {
                    for (int k = 0;k < numRepeat;k++)
                        comprText = comprText + ch;
                    repChar = false;
                }
                else
                    comprText = comprText + ch;
            }
        }
        return comprText;
    }
}
