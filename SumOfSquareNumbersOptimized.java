public class SumOfSquareNumbersOptimized {
    
	public boolean judgeSquareSum(int c) {
       		long i = 0, j = (long) Math.sqrt(c);
       		boolean result = false;

      		while(i<=j){
          		long sum = (i*i)+(j*j);
		        if (sum == c){
               			result = true;
                		break;
		        }else if (sum > c){
        	 	       j--;
            		}else {
                		i++;
            		}
        	}
	        return result;
    }
}