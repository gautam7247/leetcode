import java.util.Arrays;

class Solution {

    static boolean idFreqSame(int[] freq1, int[] freq2) {
        for (int i = 0; i < 26; i++) {
            if (freq1[i] != freq2[i]) {
                return false;
            }
        }
        return true;
    }

    public boolean checkInclusion(String s1, String s2) {

        int[] freq = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i) - 'a']++;
        }

        int windSize = s1.length();

        for (int i = 0; i <= s2.length() - windSize; i++) {

            int[] windFreq = new int[26];

            for (int j = i; j < i + windSize; j++) {
                windFreq[s2.charAt(j) - 'a']++;
            }

            if (idFreqSame(freq, windFreq)) {
                return true;
            }
        }

        return false;
    }
}