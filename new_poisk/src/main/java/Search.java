
public class Search {

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
