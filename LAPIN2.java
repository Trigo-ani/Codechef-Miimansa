/**
 * Created by Anirudh Trigunayat
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class LAPIN2
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int T=Integer.parseInt(br.readLine());
        int i;
        String S;
        int c1[]=new int[26];
        int c2[]=new int[26];

        while(T-- > 0)
        {
            for (i=0;i<26;i++)
                c1[i]=c2[i]=0;
            
            S=br.readLine().trim();
            int L=S.length();
            for(i=0;i<L/2;i++)
             {
                char ch=S.charAt(i);
                c1[ch-'a']++;
            }
            for(i=(L+1)/2;i<L;i++)
            {
                char ch=S.charAt(i);
                c2[ch-'a']++;
            }

            boolean flag=true;
            for(i=0;i<26;i++)
            {
                if(c1[i]!=c2[i])
                {
                    flag=false;
                    break;
                }
            }

            if(flag==true)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
