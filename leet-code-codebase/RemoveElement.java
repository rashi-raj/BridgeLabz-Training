import java.util.Scanner;

// Create class RemoveElement remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val 
class RemoveElement{
    public static int removeElement(int[] nums, int val) {
        int k=0;
        for(int i=0 ; i<nums.length ; i++){
            if(nums[i]!=val){
                nums[k++] = nums[i];
            }
        }
        return k;
    }
	
	public static void main(String[] args){
		// Create scanner object
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Give the size array : ");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		System.out.println("Give the elements : ");
		for(int i=0 ; i<n ; i++){
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter the value: ");
		int value = sc.nextInt();
		
		int k = RemoveElement.removeElement(arr, value);

		for(int i = 0; i < k; i++){
			System.out.print(arr[i] + " ");
		}

		
		// Close scanner stream
		sc.close();
	}
}