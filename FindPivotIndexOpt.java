public class FindPivotIndexOpt{

	public int pivotIndex(int[] nums) {
        	int[] res = new int[nums.length];
        	int sum = 0;
        	for (int i=0;i<nums.length;i++){
            		sum += nums[i];
            		res[i] = sum;
        	}
        	for (int j=0;j<res.length;j++){
            		int rightSum = res[res.length-1] - res[j];
            		int leftSum = 0;
            		if (j != 0) leftSum = res[j-1];
            		if (rightSum == leftSum){
                		return j;
            		}
        	}
        	return -1;
    	}
}