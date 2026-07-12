class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] a=arr.clone();
        Arrays.sort(a);
        HashMap<Integer,Integer> map=new HashMap<>();
        int pos=1;
        for(int x:a){
            if(!map.containsKey(x)){
                map.put(x,pos);
                pos++;
            }
        }
        for(int i=0;i<a.length;i++){
            a[i]=map.get(arr[i]);
        }
        return a;
    }
}