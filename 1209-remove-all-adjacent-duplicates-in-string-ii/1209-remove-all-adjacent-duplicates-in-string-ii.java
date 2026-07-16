class Solution {
    class Pair {
        char ch;
        int count;
        
        Pair(char ch, int count) {
            this.ch = ch;
            this.count = count;
        }
    }
    public String removeDuplicates(String s, int k) {
        Stack<Pair> st=new Stack<>();
        for(char ch:s.toCharArray()){
            if (!st.isEmpty() && st.peek().ch == ch) {
                // Agar character same hai, to frequency badhao
                st.peek().count++;
                
                // Agar frequency k ho gayi, to stack se hata do
                if (st.peek().count == k) {
                    st.pop();
                }
            } else {
                // Naya character hai, to entry insert karo
                st.push(new Pair(ch, 1));
            }
        }
        StringBuilder res=new StringBuilder();
        while(!st.isEmpty()){
            Pair curr=st.pop();
            for(int i=0;i<curr.count;i++){
                res.append(curr.ch);
            }
        }
        return res.reverse().toString();
    }
}