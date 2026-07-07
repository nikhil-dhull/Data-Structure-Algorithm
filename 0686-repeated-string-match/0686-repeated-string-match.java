class Solution {
    public int repeatedStringMatch(String a, String b) {
        StringBuffer sb=new StringBuffer();
        int count=0;
        while(sb.length()<b.length()){
            sb.append(a);
            count++;
        }
        if(sb.indexOf(b)>=0){
            return count;
        }
        sb.append(a);
        if(sb.indexOf(b)>=0){
            return count+1;
        }
        return -1;
    }
}