import java.io.*;
import java.util.*;
public class Rigged
{
    static PrintWriter out=new PrintWriter((System.out));
    public static void main(String args[])throws IOException
    {
       // Reader sc=new Reader();
       Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            solve(sc);
        }
	out.close();
    }

    public static void solve(Scanner sc)
    {
        
        //Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][]=new int[n][2];

        for(int i=0;i<n;i++){
            int m=sc.nextInt();
            int o=sc.nextInt();
            arr[i][0]=m;
            arr[i][1]=o;

        }
        for(int i=0;i<n;i++){
            if(arr[i][0]>=arr[0][0] && arr[i][1]>=arr[0][1]){
                System.out.println("-1");
                break;


            }
        }
        System.out.println(arr[0][0]);



    }
    
    static class Reader 
    { 
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer("");
        public String next()
        {
            while(!st.hasMoreTokens())
            {
                try
                {
                    st=new StringTokenizer(br.readLine());
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        public int nextInt()
        {
            return Integer.parseInt(next());
        }
        public long nextLong()
        {
            return Long.parseLong(next());
        }
        public double nextDouble()
        {
            return Double.parseDouble(next());
        }
        public String nextLine()
        {
            try
            {
                return br.readLine();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
            return null;
        }
        public boolean hasNext()
        {
            String next=null;
            try
            {
                next=br.readLine();
            }
            catch(Exception e)
            {
            }
            if(next==null)
            {
                return false;
            }
            st=new StringTokenizer(next);
            return true;
        }
    } 
}

// to run java in cmd 
// run javac filename.java
// then java filename
