import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by Anirudh Trigunayat
 */
class SALARY
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine()); // Test cases

        String tmp;
        StringTokenizer st;
        int i,N,W[],min,sum;

        while (T-- > 0)
        {

            N=Integer.parseInt(br.readLine()); // #workers

            tmp = br.readLine();
            st=new StringTokenizer(tmp);

            W=new int[N]; // stores salary of workers

            min=Integer.MAX_VALUE;
                        sum=0;
            for(i=0;i<N;i++)
            {
                W[i]=Integer.parseInt(st.nextToken());

                if(W[i] < min)
                    min= W[i];

                sum += W[i];
            }

            System.out.println( sum - (N*min) );
        }
    }
}
