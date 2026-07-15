class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        int n=deck.length;
        Arrays.sort(deck);
        Queue<Integer> que=new LinkedList<>();
        for(int i=0;i<deck.length;i++){
            que.add(i);
        }
        int[] newArr=new int[n];
        int ptr=0;
        while(!que.isEmpty()){
            int idx=que.poll();
            if(!que.isEmpty()){
            que.offer(que.poll());
            }
            newArr[idx]=deck[ptr++];
        }
        return newArr;
        
    }
}