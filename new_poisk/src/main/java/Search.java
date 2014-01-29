
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
            int i,j,N=txt.length(),M=pat.length();
            int []lg=new int[N];
            for(i=0,j=0;i<N;i++)
            {
                if (txt.charAt(i)>256)
                {
                    j=dfa[txt.charAt(i)-864][j];
                    if(j==M)
                    {
                        lg[i-j+1]=1;
                        j=0;
                    }
                }
                else
                {
                    j=dfa[txt.charAt(i)][j];
                    if(j==M)
                    {
                        lg[i-j+1]=1;
                        j=0;
                    }
                }
            }
            return lg;
        }
}
