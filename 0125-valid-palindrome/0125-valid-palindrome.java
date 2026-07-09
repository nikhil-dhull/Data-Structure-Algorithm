class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if((ch>='a' && ch<='z') || (ch>='0' && ch<='9')) sb.append(ch);
            if(ch==' ') continue;
        }
       String filtered = sb.toString();
        String reversed = sb.reverse().toString();
        return filtered.equals(reversed);
    }
}