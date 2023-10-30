import java.util.*;

public class Doremy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
    
        while (t-- > 0) {
          solve(sc);
        }
      }
    
     public static void solve(Scanner sc) {
     Map<Integer,Integer>map=new HashMap<>();
      int n=sc.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++){
        int m=sc.nextInt();
        arr[i]=m;
        map.put(m,map.getOrDefault(m,0)+1);

      }
      if(map.size()>=3){
        System.out.println("NO");

      }else{
   
                List<Integer> values = new ArrayList<>(map.values());
                Collections.sort(values);
                // if (Math.abs(values.get(0) - values.get(values.size() - 1)) <= 1) 
                if(values.get(0)==n/2 || values.get(0)==(n/2)+1 || values.get(0)==n)
                {
                    System.out.println("Yes");
                } else {
                    System.out.println("NO");
                }
            }

      }
    }