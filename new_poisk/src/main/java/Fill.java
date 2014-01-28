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
        int M=pat.length();
        if (pat.charAt(0)>256)
        {
            int k=864;
            dfa[pat.charAt(0)-k][0]=1;
            for(int x=0,j=1;j<M;j++)
            {
                for(int c=0;c<256;c++)
                    dfa[c][j]=dfa[c][x];
                dfa[pat.charAt(j)-k][j]=j+1;
                x=dfa[pat.charAt(j)-k][x];
            }
        }
        else
        {
            dfa[pat.charAt(0)][0]=1;
            for(int x=0,j=1;j<M;j++)
            {
                for(int c=0;c<256;c++)
                    dfa[c][j]=dfa[c][x];
                dfa[pat.charAt(j)][j]=j+1;
                x=dfa[pat.charAt(j)][x];
            }
        }
    }
}
