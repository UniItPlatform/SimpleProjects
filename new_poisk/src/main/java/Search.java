
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
        int numRepeat=0;
        int []lg=new int[txt.length()];
        for(int i=0;i<txt.length();i++)
        {
            if (txt.charAt(i)>256)
            {
                numRepeat=dfa[txt.charAt(i)-864][numRepeat];
                if(numRepeat==pat.length())
                {
                    lg[i-numRepeat+1]=1;
                    numRepeat=0;
                }
            }
            else
            {
                numRepeat=dfa[txt.charAt(i)][numRepeat];
                if(numRepeat==pat.length())
                {
                    lg[i-numRepeat+1]=1;
                    numRepeat=0;
                }
            }
        }
        return lg;
    }
}
