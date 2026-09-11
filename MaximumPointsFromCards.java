public class MaximumPointsFromCards {

	public int maxScore(int[] cardPoints, int k) {
        	int max = 0,count = 0,sum = 0;
        	int l=0,r=cardPoints.length-1;
        	for (l=0;l<k;l++){
            		sum += cardPoints[l];
        	}
        	max = Math.max(max,sum);
        	while(count<k){
            		sum -= cardPoints[l-1];
            		l--;
            		sum += cardPoints[r];
            		r--;
            		max = Math.max(max,sum);
            		count++;
        	}
        	return max;
    	}
}