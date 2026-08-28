import java.util.*;

class Solution {
    public int[] nextGreaterElements(int[] nums) {

        int n = nums.length;
        int[] ans = new int[n];

        // Initially sabko -1
        Arrays.fill(ans, -1);

        Stack<Integer> st = new Stack<>();

        // Circular array ko handle karne ke liye 2 baar traverse
        for (int i = 0; i < 2 * n; i++) {

            int idx = i % n;

            // Current element stack ke top se greater hai
            while (!st.isEmpty() && nums[st.peek()] < nums[idx]) {

                int topIndex = st.pop();
                ans[topIndex] = nums[idx];
            }

            // Sirf first traversal mein index push karna hai
            if (i < n) {
                st.push(idx);
            }
        }

        return ans;
    }
}