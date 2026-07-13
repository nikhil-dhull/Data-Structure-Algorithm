class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> sets=new HashSet<>();
        int left=0;
        int maxlen=0;
        for(int i=0;i<s.length();i++){
            while(sets.contains(s.charAt(i))){
                sets.remove(s.charAt(left));
                left++;
            }
            sets.add(s.charAt(i));
            maxlen=Math.max(maxlen,i-left+1);
        }
        return maxlen;
    }
}