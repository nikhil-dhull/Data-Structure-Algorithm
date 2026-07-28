class Solution {
    public String smallestPalindrome(String s) {
        int[] freq = new int[26];
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        StringBuilder firstHalf = new StringBuilder();
        char middle = '\0';

        for (int i = 0; i < 26; i++) {
            int half = freq[i] / 2;
            while (half-- > 0) {
                firstHalf.append((char) ('a' + i));
            }
            if (freq[i] % 2 == 1) {
                middle = (char) ('a' + i);
            }
        }

        StringBuilder ans = new StringBuilder(firstHalf);
        if (middle != '\0') {
            ans.append(middle);
        }

        // Reversed first half appended, then converted to String
        ans.append(new StringBuilder(firstHalf).reverse());
        return ans.toString();
    }
}