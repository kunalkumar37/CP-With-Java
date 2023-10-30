import java.util.*;

public class D {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

    while (t-- > 0) {
      solve(sc);
    }
  }

  public static void solve(Scanner sc) {
    int n = sc.nextInt();
    int[][] arr = new int[n][2];

    for (int i = 0; i < n; i++) {
      int m = sc.nextInt();
      int o = sc.nextInt();
      arr[i][0] = m;
      arr[i][1] = o;
    }

    for (int i = 1; i < n; i++) {
      if (arr[i][0] >= arr[0][0] && arr[i][1] >= arr[0][1]) {
        System.out.println("-1");
        return;
      }
    }

    System.out.println(arr[0][0]);
  }
}