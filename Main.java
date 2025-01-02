import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            int n = scanner.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            
            // Read input
            for (int i = 0; i < n; i++) {
                arr.add(scanner.nextInt());
            }
            
            // Remove duplicates
            ArrayList<Integer> unique = new ArrayList<>();
            for (int num : arr) {
                if (unique.isEmpty() || !unique.get(unique.size() - 1).equals(num)) {
                    unique.add(num);
                }
            }
            
            int result = unique.size();
            
            // Check for strictly increasing/decreasing sequences of 3
            for (int i = 0; i < unique.size() - 2; i++) {
                if ((unique.get(i) < unique.get(i + 1) && unique.get(i + 1) < unique.get(i + 2)) ||
                    (unique.get(i) > unique.get(i + 1) && unique.get(i + 1) > unique.get(i + 2))) {
                    result--;
                }
            }
            
            System.out.println(result);
        }
        scanner.close();
    }
}