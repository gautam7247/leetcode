class Solution {
    public String reverseWords(String s) {
        StringBuilder str = new StringBuilder();
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != ' ') {
                str.append(ch);
            } else {
                if (str.length() > 0) {
                    if (ans.length() > 0)
                        ans.append(" ");
                    ans.append(str.reverse());
                    str.setLength(0);
                }

            }
        }
        if (str.length() > 0) {
            if (ans.length() > 0)
            ans.append(" ");
            ans.append(str.reverse());
            str.setLength(0);
        }
    return ans.toString();
    }
}