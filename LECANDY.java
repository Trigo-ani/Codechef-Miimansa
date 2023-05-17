import java.io.*;
import java.util.*;

/**
 * Created by Anirudh Trigunayat
 */

class LECANDY
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int T =Integer.parseInt(br.readLine()); // Test cases

        String tmp;
        StringTokenizer st;
        int N,C,i,sum;

        do // running till # of test cases
        {
            tmp = br.readLine();  // N C

            st = new StringTokenizer(tmp); // tokenize above string

            N = Integer.parseInt(st.nextToken());  // convert to int
            C = Integer.parseInt(st.nextToken());

            tmp = br.readLine();  // 'N' elephant candies, in a line

            st=new StringTokenizer(tmp); // tokenize in N parts

            sum=0;  // for every test case sum becomes = 0

            for(i=0;i<N;i++) // Taking dosage of 'N' elephants
            {
                sum += Integer.parseInt(st.nextToken());
            }

            if(sum <= C)
                System.out.println("Yes");

            else
                System.out.println("No");

            T--;
        }
        while(T!=0);
    }
}
