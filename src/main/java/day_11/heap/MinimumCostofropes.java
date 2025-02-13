package day_11.heap;

class Solution {
    // Function to return the minimum cost of connecting the ropes.
    public int minCost(int[] arr) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int cost = 0;
        for (int num : arr) {
            pq.add(num);
        }
        while(pq.size()>1){
            int first = pq.poll();
            int second = pq.poll();
            cost += first + second;
            pq.add(first + second);
        }
        return cost;
    }
}