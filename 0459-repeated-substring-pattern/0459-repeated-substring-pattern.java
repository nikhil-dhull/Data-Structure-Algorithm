class Solution {
    public boolean repeatedSubstringPattern(String s) {
         int n=s.length();
        String res="";
        for(int i=0;i<s.length()/2;i++){
            res+=s.charAt(i);
            
            if(n%res.length()==0){
                String temp="";
                int times=n/res.length();
                for(int j=0;j<times;j++){
                    temp+=res;
                }
                if(temp.equals(s)) return true;
            }
        }
        return false;
    }
}