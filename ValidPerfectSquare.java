public class ValidPerfectSquare {

	public boolean isPerfectSquare(int num) {       
        	if (num < 2) return true;
        	int l = 1, r = num/2;
        	while (l <= r){
            		int mid = l+(r-l)/2;
            		long square = (long) mid*mid;
            		if (square == num) return true;
            		else if (square < num) l = mid+1;
            		else r = mid-1;
        	}
        	return false;
    	}
}