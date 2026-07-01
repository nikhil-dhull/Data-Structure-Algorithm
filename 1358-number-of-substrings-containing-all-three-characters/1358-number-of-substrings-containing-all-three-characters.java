class Solution {
    public int numberOfSubstrings(String s) {
        int left=0;
        int right=0;
        int[] count=new int[3];
        int num=0;
        while(right<s.length()){
            count[s.charAt(right)-'a']++;
            while(count[0]>0 && count[1]>0 && count[2]>0){
                num+=s.length()-right;
                count[s.charAt(left)-'a']--;
                left++;
            }
            right++;
        }
        return num;
        
    }
}