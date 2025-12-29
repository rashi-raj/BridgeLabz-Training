// https://leetcode.com/problems/alternating-digit-sum/
// Problem - 2544

class AlternateDigitSum {
    public int alternateDigitSum(int n) {
        int sum = 0;
        int copy = n;
        
        int i=0;
        while(copy>0){
            int rem = copy%10;
            if(i%2==0){
                sum += rem;
            }else{
                sum -= rem;
            }
            copy/=10;
            i++;
        }
        return sum;
    }
}