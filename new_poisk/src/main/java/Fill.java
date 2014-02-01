import java.net.URLEncoder;

public class Fill {
    /**
     * method arr fills the matrix numbers if all the word is found in the text,
     * the last character of the word in the matrix is set equal to the length of the word.
     * @param pat word which  looking for
     * @param dfa matrix  the length 256 and wordlength "pat"
     */
    void arr(String pat,int [][]dfa)
    {
        if (pat.charAt(0)>256)
        {
            int TransRusAlph=864;
            dfa[pat.charAt(0)-TransRusAlph][0]=1;
            for(int NumRepeat=0,j=1;j<pat.length();j++)
            {
                dfa[pat.charAt(j)-TransRusAlph][j]=j+1;
                NumRepeat=dfa[pat.charAt(j)-TransRusAlph][NumRepeat];
            }
        }
        else
        {
            dfa[pat.charAt(0)][0]=1;
            for(int NumRepeat=0,j=1;j<pat.length();j++)
            {
                dfa[pat.charAt(j)][j]=j+1;
                NumRepeat=dfa[pat.charAt(j)][NumRepeat];
            }
        }
    }
}
