class Solution {
    public String longestCommonPrefix(String[] strs) {
        String str = strs[0];
        if (strs.length == 1 || str.length() == 0) {
            return str;
        }

        boolean flag = true;
        int j = 0;
        while (j < str.length() && flag) {
            char ch = str.charAt(j);
            for (int i = 1; i < strs.length; i++) {
                String str1 = strs[i];
                if (j >= str1.length()) {
                    flag = false;
                    break;
                }
                char ch1 = str1.charAt(j);
                if (ch1 == ch) {

                } else {
                    flag = false;
                    break;
                }
            
            }
            if(flag){
            j++;
                
            }else{
                break;
            }
            
        }
        if (j == 0) {
            return "";
        }
        return str.substring(0, j );
    }
}