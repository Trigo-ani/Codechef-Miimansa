import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by Anirudh Trigunayat
 */
class CSUB
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringTokenizer st;
        int i;
        long N,count;
        String S;
        char arr[];

        while (T-- > 0)
        {
            count=0;
            N=Long.parseLong(br.readLine());  // ALWAYS TAKE A LONG VALUE WHEN TAKING BINARY STRING
            S=br.readLine();
            //arr=S.toCharArray();

            /*
            method 2- don't take array use string directly*/
            for(i=0;i<S.length();i++)
            {
                if(S.charAt(i)=='1')
                    count++;  // LONG VALUE GIVING CORRECT ANSWER
            }

            /*method 1-
            for(i=0;i<N;i++)
            {
                if(arr[i]=='1')
                    count++;
            }
            */
            System.out.println(count*(count+1)/2);
        }
    }
}
