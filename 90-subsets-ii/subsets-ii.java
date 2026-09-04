import java.util.*;

class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums); // duplicates ko ek saath lane ke liye
        
        backtrack(0, nums, new ArrayList<>(), ans);
        
        return ans;
    }

    private void backtrack(int start, int[] nums, 
                           List<Integer> current, 
                           List<List<Integer>> ans) {
        
        // Har current subset ko answer me add karo
        ans.add(new ArrayList<>(current));
        
        for (int i = start; i < nums.length; i++) {
            
            // Same recursion level par duplicate skip karo
            if (i > start && nums[i] == nums[i - 1]) {
                continue;
            }
            
            // Choose
            current.add(nums[i]);
            
            // Explore
            backtrack(i + 1, nums, current, ans);
            
            // Unchoose (Backtrack)
            current.remove(current.size() - 1);
        }
    }
}