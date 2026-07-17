class Solution {
    public String removeDuplicateLetters(String s) {
        int n=s.length();
        String res="";
        int[] lastindex=new int[26];
        boolean[] taken=new boolean[26];
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            lastindex[ch-'a']=i;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            int idx = ch - 'a';
            
            // Agar character pehle se stack/result mein hai, toh skip karo
            if (taken[idx]) continue;
            // Jab tak stack ka last character current character se bada hai
            // aur wo baad mein bhi aane wala hai, tab tak use remove karte jao
            while (sb.length() > 0 && sb.charAt(sb.length() - 1) > ch && lastindex[sb.charAt(sb.length() - 1) - 'a'] > i) {
                taken[sb.charAt(sb.length() - 1) - 'a'] = false;
                sb.deleteCharAt(sb.length() - 1);
            }
            
            // Current character ko add karo aur seen mark karo
            sb.append(ch);
            taken[idx] = true;
        }
        
        return sb.toString();
    }
}