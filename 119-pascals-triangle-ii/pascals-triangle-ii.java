import java.util.*;

class Solution {
    public List<Integer> getRow(int rowIndex) {
        int n = rowIndex;

        int[][] ans = new int[n + 1][];

        for (int i = 0; i <= n; i++) {
            ans[i] = new int[i + 1];

            ans[i][0] = ans[i][i] = 1;

            for (int j = 1; j < i; j++) {
                ans[i][j] = ans[i - 1][j]
                          + ans[i - 1][j - 1];
            }
        }

        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            arr.add(ans[n][i]);
        }

        return arr;
    }
}