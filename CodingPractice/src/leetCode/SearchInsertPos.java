package leetCode;
/**
 * 35 
 * @author chinmaysingh
 *
 */

public class SearchInsertPos {
	
	public static int searchInsert(int[] nums, int target) {
		if(nums.length==0) return 0;
		System.out.println(nums.length);
        int start =0, last = nums.length-1;
        while(start <nums.length && start < last && last >0){
            int mid = (start + last)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if((last - start) == 1){
                return last;
            }
            else if(nums[mid] < target){
                start = mid;
            }
            else{
                last = mid;
            }
        }
        return last;
    }
	

	public static void main(String[] args) {
		int[] nums = new int[] {};
		System.out.println(searchInsert(nums, 5));

	}

}
/**
if(first <= last) {
    int mid = (first + (last-1))/2;
    if(nums[mid] == third) return true;
    else if(third < nums[mid]){
        last = mid -1;
        binarySearch(nums, first, last, third);
    }
    else{
        first = mid+1;
        binarySearch(nums, first, last, third);
    }
}
return false;
*/
