public class SumOfSquareNumbers {

    public boolean judgeSquareSum(int c) {
        boolean result = false;

        for (int i=0;i<=c;i++){
            for (int j=0;j<=c;j++){
                int sum = (i*i)+(j*j);
                if (sum == c){
                    result = true;
                    break;
                }else {
                    continue;
                }
            }
        }
        return result;
    }
}