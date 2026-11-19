public class BinarySearchRecursion {

	public int search(int[] nums, int target) {
        	int l = 0,r = nums.length-1;
        	return binarySearch(nums,l,r,target);
    	}

    	private int binarySearch(int[] nums, int left, int right, int target){
        	if (left > right) return  -1;
        	int mid = left+(right-left)/2;
        	if (nums[mid] == target) return mid;
        	else if (nums[mid] < target) return binarySearch(nums,mid+1,right,target);
        	return binarySearch(nums,left,mid-1,target);
    	}
}