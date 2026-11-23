public class RotateArrayBF{

	public void rotate(int[] nums, int k) {
        	int n = nums.length;
        	int[] arr = new int[n];
        	for (int i=0;i<n;i++){
            		arr[i] = nums[i];
        	}
        	for (int i=0;i<n;i++){
            		int j = (i+k)%n;
            		nums[j] = arr[i];
        	}
    	}
}