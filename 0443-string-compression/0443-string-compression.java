class Solution {
    public int compress(char[] chars) {
        int left=0;
        int right=0;
        int count=0;
        int i=0;
        while(right<chars.length){
            char ch=chars[right];
            if(chars[left]==chars[right]){
                right++;
                count++;
            }
            else{
                chars[i++]=chars[left];
                if(count>1){
                String str=String.valueOf(count);
                for(char x:str.toCharArray()){
                    chars[i++]=x;
                }
                }
                count=0;
                left=right;
            }
        }
        chars[i++]=chars[left];
        if(count>1){
           String str=String.valueOf(count);
                for(char x:str.toCharArray()){
                    chars[i++]=x;
                }
        }
        return i;
    }
}