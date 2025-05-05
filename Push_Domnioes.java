import java.util.*;

public class Push_Domnioes {
    public String pushDominoes(String dominoes) {
        char[] result = dominoes.toCharArray();
        Stack<Integer> stack = new Stack<>();
        int n = dominoes.length();

        for (int i = 0; i < n; i++) {
            char c = result[i];
            if (c == 'R') {
                stack.push(i);
            } else if (c == 'L') {
                if (stack.isEmpty()) {
                    // No 'R' before, fall left
                    int j = i - 1;
                    while (j >= 0 && result[j] == '.') {
                        result[j--] = 'L';
                    }
                } else {
                    // Resolve dominoes between last 'R' and current 'L'
                    int rIndex = stack.pop();
                    int left = rIndex + 1;
                    int right = i - 1;
                    while (left < right) {
                        result[left++] = 'R';
                        result[right--] = 'L';
                    }
                    // if left == right, stays '.'
                }
            }
        }

        // Any remaining 'R' in stack → fall right
        while (!stack.isEmpty()) {
            int rIndex = stack.pop();
            int j = rIndex + 1;
            while (j < n && result[j] == '.') {
                result[j++] = 'R';
            }
        }

        return new String(result);
    }

  
}

