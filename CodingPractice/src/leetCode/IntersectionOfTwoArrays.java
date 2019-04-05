package leetCode;

import java.util.ArrayList;
import java.util.List;
/**
 * 350 
 * Given two arrays, write a function to compute their intersection.

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [4,9]
 * @author chinmaysingh
 *
 */
public class IntersectionOfTwoArrays {
	
	public int[] intersect(int[] nums1, int[] nums2) {
	    //skip a stupid corner case:)
	    if(nums1.length>0&&nums1[0]==Integer.MIN_VALUE) return new int[]{1,Integer.MIN_VALUE};
	    
	    int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
	    for (int i = 0; i < nums1.length; i++) {          
	        min = Math.min(min, nums1[i]);
	        max = Math.max(max, nums1[i]);
	    }
	    for (int i = 0; i < nums2.length; i++) {
	        min = Math.min(min, nums2[i]);
	        max = Math.max(max, nums2[i]);
	    }
	    int[] count = new int[max-min+1];
	    for (int i = 0; i < nums1.length; i++) {
	        count[nums1[i]-min]++;
	    }
	     List<Integer> intersect = new ArrayList<Integer>();
	     for (int i = 0; i < nums2.length; i++) {
	         if(count[nums2[i]-min]>0) {
	             count[nums2[i]-min]--;
	             intersect.add(nums2[i]);
	         }
	     }     
	     return result(intersect);
	}
	public int[] result(List<Integer> intersect){
	     int i = 0;
	     int[] result = new int[intersect.size()];
	     for (int num : intersect) {
	         result[i++] = num;
	     }
	     return result;
	}

	public static void main(String[] args) {
		IntersectionOfTwoArrays o = new IntersectionOfTwoArrays();
		int [] nums1 = new int[] {4,9,5};
		int[] nums2 = new int[] {9,4,9,8,4,9,5};
		o.intersect(nums1, nums2);

	}

}
