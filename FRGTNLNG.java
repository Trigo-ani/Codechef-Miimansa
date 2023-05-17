import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by Trigo 
 */
class FRGTNLNG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringTokenizer st;
        int i,j,k,N,K,L;

        String DIC[],RES[]; // DICTIONARY
        String tmp;
        while (T-- > 0)
        {
            st=new StringTokenizer(br.readLine());
            N=Integer.parseInt(st.nextToken()); // # of DIC WORDS
            K=Integer.parseInt(st.nextToken()); // # of ENG PHRASES

            DIC = new String[N];
            DIC = br.readLine().split(" ");
            RES = new String[N];
            for(i=0;i<N;i++)
                RES[i]="NO";

            for(i=0;i<K;i++)
            {
                st=new StringTokenizer(br.readLine());
                L=Integer.parseInt(st.nextToken());
                for(j=0;j<L;j++)
                {
                    tmp=st.nextToken();
                    for(k=0;k<N;k++)
                    {
                        if (!(RES[k].equals("YES")) && (DIC[k].equals(tmp))) {
                            RES[k] = "YES";
                        }
                    }
                }
            }
            for(j=0;j<N;j++)
                System.out.print(RES[j]+" ");
            System.out.println();

        }
    }
}
