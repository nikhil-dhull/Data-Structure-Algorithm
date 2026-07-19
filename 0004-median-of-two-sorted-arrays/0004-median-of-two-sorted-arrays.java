class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length+nums2.length;
        int[] merge=new int[n];
        for(int i=0;i<nums1.length;i++){
            merge[i]=nums1[i];
        }
        for(int i=0;i<nums2.length;i++){
            merge[nums1.length+i]=nums2[i];
        }
        Arrays.sort(merge);
        int mid=merge.length/2;
        if(n%2==0){
            double median=(merge[mid-1]+merge[mid])/2.0;
            return median;
        }
        else{
            int median=merge[mid];
            return median;
        }
    }
}