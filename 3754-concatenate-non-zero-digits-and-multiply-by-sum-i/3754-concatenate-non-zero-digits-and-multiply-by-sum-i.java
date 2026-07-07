class Solution {
    public long reverse(long n){
        long rev=0;
        while(n!=0){
            long digi=n%10;
            rev=rev*10+digi;
            n/=10;
        }
        return rev;
    }
    public long sumAndMultiply(int n) {
        long rev=0;
        long sum=0;

        while(n!=0){
            long digit=n%10;
            if(digit!=0){
                sum+=digit;
                rev=rev*10+digit;
                
            }
            n/=10;
        }
        long org=reverse(rev);
        return org*sum;
    }
}