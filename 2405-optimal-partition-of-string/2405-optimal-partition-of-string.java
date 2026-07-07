class Solution {
    public int partitionString(String s) {
        HashSet<Character> set=new HashSet<>();
        int i=0;
        int count=0;
        while(i<s.length()){
            char ch=s.charAt(i);
            if(set.contains(ch)){
                set.clear();
                count++;
            }
            set.add(s.charAt(i));
            i++;
        }
        if(!set.isEmpty()){
            count++;
        }
        return count;
    }
}