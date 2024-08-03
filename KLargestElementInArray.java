class Solution {
    public int findKthLargest(int[] nums, int k) {
        if(nums == null || nums.length == 0) {
            return -1;
        }
        
        // using min head of size k

        // PriorityQueue<Integer> pq = new PriorityQueue<>();
        // int n = nums.length;
        // for(int i = 0; i < n; i++) {
        //     pq.add(nums[i]);
        //     if(pq.size() > k) {
        //         pq.poll();
        //     }
        // }
        // return pq.peek();


        // using max head of size n-k
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++) {
            pq.add(nums[i]);
            if(pq.size() > n - k) {
                min = Math.min(min, pq.poll());
            }
        }
        return min;
    }
}
