
public class Search {
    /**
     * show returns array to display what positions found words in the text
     * @param txt text
     * @param pat word which  looking for
     * @param dfa matrix  the length 256 and wordlength "pat"
     * @return lg array
     */
    public int[] show(String txt,String pat,int [][]dfa)
    {
        int NumRepeat=0;
        int []lg=new int[txt.length()];
        for(int i=0;i<txt.length();i++)
        {
            if (txt.charAt(i)>256)
            {
                NumRepeat=dfa[txt.charAt(i)-864][NumRepeat];
                if(NumRepeat==pat.length())
                {
                    lg[i-NumRepeat+1]=1;
                    NumRepeat=0;
                }
            }
            else
            {
                NumRepeat=dfa[txt.charAt(i)][NumRepeat];
                if(NumRepeat==pat.length())
                {
                    lg[i-NumRepeat+1]=1;
                    NumRepeat=0;
                }
            }
        }
        return lg;
    }
}
