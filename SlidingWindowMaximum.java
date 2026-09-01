public class SlidingWindowMaximum {

	public int[] maxSlidingWindow(int[] nums, int k) {
        	ArrayList<Integer> list = new ArrayList<>();
        	for (int i=0;i<=nums.length-k;i++){
            		int max = Integer.MIN_VALUE;;
            		for (int j=i;j<i+k;j++){
                		max = Math.max(max,nums[j]);
            		}
            		list.add(max);
        	}
        	int[] result = list.stream().mapToInt(i->i).toArray();
        	return result;
    	}
}