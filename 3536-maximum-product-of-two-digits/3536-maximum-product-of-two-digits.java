class Solution {
    public int maxProduct(int n) {
        int max = 0;
        int secmax = 0;
        while(n>0){
            int digi=n%10;
            if(digi>=max){
                secmax=max;
                max=digi;
                
            }else if (digi > secmax) {
                secmax = digi;  
            }
            n/=10;
        }
        return max*secmax;
    }
}