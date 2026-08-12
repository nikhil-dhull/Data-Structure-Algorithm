class Pair {
    int first;
    int second;

    Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
}
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
         PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)-> a.second-b.second);
         HashMap<Integer,Integer> freq=new HashMap<>();
         for(int num:nums){
            freq.put(num,freq.getOrDefault(num,0)+1);
         }
         for(Map.Entry<Integer,Integer>entry :freq.entrySet()){
            pq.offer(new Pair(entry.getKey(),entry.getValue()));
            if(pq.size()>k) pq.poll();
         }
         int[] res=new int[k];
         for(int i=0;i<k;i++){
            res[i]=pq.poll().first;
         }
         return res;
    }

}