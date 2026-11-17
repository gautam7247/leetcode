
class Solution {
    public int compress(char[] chars) {
        int idx = 0;
        int i = 0;
        int n = chars.length;

        while (i < n) {
            char curr = chars[i];
            int count = 0;

            // Count consecutive characters
            while (i < n && chars[i] == curr) {
                count++;
                i++;
            }

            // Write the character
            chars[idx++] = curr;

            // Write count only if greater than 1
            if (count > 1) {
                String s = String.valueOf(count);

                for (int j = 0; j < s.length(); j++) {
                    chars[idx++] = s.charAt(j);
                }
            }
        }

        return idx;
    }
}
