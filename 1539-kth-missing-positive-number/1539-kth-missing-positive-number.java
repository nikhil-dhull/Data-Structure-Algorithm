class Solution {
    public int findKthPositive(int[] arr, int k) {
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(high+low)/2;
            int miss=arr[mid]-(mid+1);
            if(miss<k){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return high+1+k;
    }
    //oh math kya bani?

// Answer = arr[high] + (k - miss)

// Isme miss ki value (arr[high] - high - 1) daal do:

// Answer = arr[high] + k - (arr[high] - high - 1)

// arr[high] se arr[high] cut gaya! 🤯

// Bachega kya? high + 1 + k
}