public class MaximumAbsoluteSumSubArray {

	public int maxAbsoluteSum(int[] nums) {
        	int max = 0;
        	for (int i=0;i<nums.length;i++){
            		int sum = 0;
            		for (int j=i;j<nums.length;j++){
                		sum += nums[j];
                		if (sum < 0) max = Math.max(max,-sum);
                		else max = Math.max(max,sum);
            		}
        	}
        	return max;
    	}
}