class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st=new Stack<>();
        for(int ast:asteroids ){
            boolean isAlive=true;
            while(!st.isEmpty() && st.peek()>0 && ast<0){
                if(st.peek()< -ast){
                    st.pop();
                    
                }
                else if(st.peek()== -ast){
                    st.pop();
                    isAlive=false;
                    break;
                }
                else{
                    isAlive=false;
                    break;
                }


            }
            if(isAlive){
                st.push(ast);
            }
        }
        int[] res=new int[st.size()];
        for(int i=st.size()-1;i>=0;i--){
            res[i]=st.pop();
        }
        return res;
    }
}