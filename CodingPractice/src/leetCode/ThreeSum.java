package leetCode;

import java.util.*;



public class ThreeSum {
	
	
    public static int binarySearch(int[] arr, int l, int r, int x){
    	if (r >= l) { 
            int mid = l + (r - l) / 2; 
  
            // If the element is present at the 
            // middle itself 
            if (arr[mid] == x) 
                return mid; 
  
            // If element is smaller than mid, then 
            // it can only be present in left subarray 
            if (arr[mid] > x) 
                return binarySearch(arr, l, mid - 1, x); 
  
            // Else the element can only be present 
            // in right subarray 
            return binarySearch(arr, mid + 1, r, x); 
        } 
  
        // We reach here when element is not present 
        // in array 
        return -1; 
    }
    
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int first = 0;
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        int last = nums.length -1;
        while(first < last){
            int third = 0 - (nums[first] + nums[last]);
            if(third <= nums[last] && third >= nums[first]){
                int flag = binarySearch(nums, first+1, last-1, third);
                if(flag > 1){
                    ArrayList<Integer> temp = new ArrayList<Integer>();
                    temp.add(nums[first]);
                    temp.add(nums[last]);
                    temp.add(third);
                    result.add(temp);
                    
                }
                last--;
                
            }
            else if(third > nums[last]){
                first++;
            }
            else {
                last--;
            }
        }
        System.out.println(result.toString());
        return result;
    }
	

	public static void main(String[] args) {
		int[] arr = new int[] {-1,0,1,2,-1,-4};
		threeSum(arr);

	}

}
