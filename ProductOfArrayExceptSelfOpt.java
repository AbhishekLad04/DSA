public class ProductOfArrayExceptSelfOpt {

	public int[] productExceptSelf(int[] nums) {
        	int[] res = new int[nums.length];
	        res[0]=1;
        	for (int i=1;i<nums.length;i++){
            		res[i] = nums[i-1] * res[i-1];
        	}
        	int rightProd = 1;
        	for (int j=res.length-1;j>=0;j--){
        	    res[j] = rightProd * res[j];
        	    rightProd *= nums[j];
        	}
        	return res;
    	}
}