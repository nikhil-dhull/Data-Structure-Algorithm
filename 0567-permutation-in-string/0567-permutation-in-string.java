class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int len1=s1.length();
        int len2=s2.length();
        if (len1 > len2) return false;
        int[] s1Count=new int[26];
        int[] s2Count=new int[26];
        for (int i = 0; i < s1.length(); i++) {
            s1Count[s1.charAt(i) - 'a']++;
            s2Count[s2.charAt(i) - 'a']++;
        }
        boolean flag=true;
        for(int i=0;i<26;i++){
            if(s1Count[i]!=s2Count[i]){ 
                flag=false; 
                break;
            }
            
        }
        if(flag) return true;

        for (int i = len1; i < len2; i++) {
            s2Count[s2.charAt(i) - 'a']++;       
            s2Count[s2.charAt(i - len1) - 'a']--; 
            flag = true;
            for (int k = 0; k < 26; k++) {
                if (s1Count[k] != s2Count[k]) {
                    flag = false;
                    break;
                }
            }
            if (flag) return true;
    }
    return false;
    }
}