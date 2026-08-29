public class SubArrayProductKOptimized {

	public int numSubarrayProductLessThanK(int[] nums, int k) {
        	int count = 0;
        	int l=0,product=1;

        	if (k<=1) return 0;

        	for (int r=0;r<nums.length;r++){
           		product *= nums[r];
            		while(product>=k){
                		product /= nums[l];
                		l++;
            		}
            		count += r-l+1;
        	}        
        	return count;
    	}
}