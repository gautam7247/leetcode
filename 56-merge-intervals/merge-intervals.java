import java.util.Arrays;

class Solution {
    public int[][] merge(int[][] arr) {
        if (arr.length <= 1) return arr;

        Arrays.sort(arr, (a, b) -> a[0] - b[0]);

        int[][] res = new int[arr.length][2];
        int k = 0;

        res[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i][0] <= res[k][1]) {
                if (arr[i][1] > res[k][1]) {
                    res[k][1] = arr[i][1];
                }
            } else {
                k++;
                res[k] = arr[i];
            }
        }

        return Arrays.copyOf(res, k + 1);
    }
}