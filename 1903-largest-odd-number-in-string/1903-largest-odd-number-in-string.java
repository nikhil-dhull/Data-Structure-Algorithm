class Solution {
    public String largestOddNumber(String num) {
        //loop ko piche se chla denge taaki phla odd milte h us tk saara return kr denge 
        for(int i=num.length()-1;i>=0;i--){
            int digi=num.charAt(i)-'0';
            if(digi%2!=0){
                return num.substring(0,i+1);
            }
        }                       
        return "";
    }
}