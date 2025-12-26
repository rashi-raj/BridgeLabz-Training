import java.util.Scanner;
import java.util.Arrays;

class TwoSum{

	// Method to find two sum
    public int[] twoSum(int[] nums, int target) {
        for(int i=0 ; i<nums.length-1 ; i++){
            for(int j=i+1 ; j<nums.length ; j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
	
	public static void main(String[] args){
		// Create scanner object
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Give the size array");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		System.out.println("Give the elements");
		for(int i=0 ; i<n ; i++){
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Give the target");
		int target = sc.nextInt();
		
		TwoSum obj = new TwoSum();
		int ans[] = obj.twoSum(arr, target);
		
		System.out.println(Arrays.toString(ans));
		
		// Close scanner stream
		sc.close();
	}
}