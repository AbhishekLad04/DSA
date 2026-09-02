public class SlidingWindowMaximumOpt {

	public int[] maxSlidingWindow(int[] nums, int k) {
        	int[] result = new int[nums.length-k+1];
        	Deque<Integer> deque = new LinkedList<>();
        	for (int r=0;r<nums.length;r++){
            		while (!deque.isEmpty() && deque.peekFirst() <= r-k){
                		deque.pollFirst();
            		}
            		while (!deque.isEmpty() && nums[deque.peekLast()] < nums[r]) {
                		deque.pollLast();
            		}
            		deque.addLast(r);
            		if (r >= k-1){
               			result[r-k+1] = nums[deque.peekFirst()];
            		}
        	}
        	return result;
    	}
}