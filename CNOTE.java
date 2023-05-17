import java.io.*;
import java.util.*;

/**
 * Created by Anirudh Trigunayat
 */
class CNOTE
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int T =Integer.parseInt(br.readLine()); // Test cases

        String tmp;
        StringTokenizer st;
        int X,Y,K,N,i,P[],C[];

        while( T != 0 )
        {
            T--;

            tmp=br.readLine();

            st=new StringTokenizer(tmp);

            X=Integer.parseInt(st.nextToken()); // poetry pages
            Y=Integer.parseInt(st.nextToken()); // left pages
            K=Integer.parseInt(st.nextToken()); // rubles left
            N=Integer.parseInt(st.nextToken()); // notebooks shopkeeper has

            // X-Y is the # of pages that he require to complete his peotry

            P=new int[N];
            C=new int[N];

            for(i=0; i<N; i++)
            {
                tmp=br.readLine();
                st=new StringTokenizer(tmp);

                P[i]=Integer.parseInt(st.nextToken()); // pages in notebook
                C[i]=Integer.parseInt(st.nextToken()); // cost of notebook
            }

            boolean flag=false;

            for(i=0; i<N ;i++)
            {
                if( C[i] <= K )
                {
                    if( P[i] >= (X-Y) )
                    {
                        flag=true;
                        break;
                    }
                }
            }

            if(flag==true)
                System.out.println("LuckyChef");
            else
                System.out.println("UnluckyChef");

        }
    }
}
