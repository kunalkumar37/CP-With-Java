import java.util.Scanner;

public class Big_difference {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            solve(sc);
        }

    }
    public static void solve(Scanner sc){
        int N=sc.nextInt();
        int K=sc.nextInt();

        if(N<=K){
            System.out.println("-1"+" "+"-1");

        }
        else{
            if(N%2!=0){
                if(N-K>=2){
                    System.out.println(N+" "+"2");
    
                }
                else{
                    System.out.println("-1"+" "+"-1");
    
                }
            }
            else{
                if((N-K-1)>=2){
                    System.out.println((N-1)+" "+2);

                }
                else{
                    System.out.println("-1"+" "+"-1");
                }
            }
            
        }
    }
}
