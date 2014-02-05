
public class ArchDecomprTest {
    /**
     * Decompress method. if is found number - N, N is recorded after the number of characters
     * @param DecomprText text which should be decompressed
     * @return Decompressed text
     */
    public String DecompressTest(String DecomprText)
    {
        char ch;
        boolean RepChar = false;
        int NumRepeat=1;
        String ComprText = "";
        for (int i=0;i<DecomprText.length();i++)
        {
            ch = DecomprText.charAt(i);
            if (ch > 47 && ch < 58 )
            {
                if (RepChar)
                {
                    NumRepeat = NumRepeat*10 + (int)(ch) - 48;
                }
                else
                {
                    NumRepeat = DecomprText.charAt(i) - 48;
                    RepChar = true;
                }
            }
            else
            {
                if (RepChar)
                {
                    for (int k = 0;k < NumRepeat;k++)
                        ComprText = ComprText + ch;
                    RepChar = false;
                }
                else
                    ComprText = ComprText + ch;
            }
        }
        return ComprText;
    }
}
