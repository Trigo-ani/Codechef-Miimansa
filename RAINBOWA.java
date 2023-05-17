import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by Anirudh Trigunayat
 */
class RAINBOWA
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int T =Integer.parseInt(br.readLine());

        StringTokenizer st;
        int i,j,N,A[],tmp,c;
        while(T-- > 0)
        {
            N=Integer.parseInt(br.readLine());
            st=new StringTokenizer(br.readLine());
            A=new int[N];
            for(i=0;i<N;i++)
            {
                A[i]=Integer.parseInt(st.nextToken());
            }

            boolean flag=true;
            for(i=0,j=N-1;i<=j;i++,j--)
            {
                if(A[i]!=A[j] || A[i]>7)
                                {
                    flag=false;
                    break;
                }
            }
            
            if(A[0]!=1 || A[N/2]!=7)
                flag=false;
            
            if(flag==false) // checking
                System.out.println("no");
            else  // if flag==true
            {
                //flag=true;
                //tmp=A[N/2];
                c=1; // seq count
                for(i=0;i<N/2;i++)
                {
                    // ANOTHER METHOD IS TO TAKE THE DIFFERENCE OF VALUES AT INDEX I AND I+1 IS 1
                    if(A[i]!=c)
                    {
                        if( A[i]!=c+1 )
                        {
                            flag=false;
                            System.out.println("no");
                        }
                        else if( A[i]==c+1 )
                        {
                            c++;
                        }
                    }
                }
                if(flag==true || c>7)
                    System.out.println("yes");
                else
                    System.out.println("no");
            }
        }
    }
}
