package leetCode;

public class RemoveDuplicatesFromSorted {
	
	public int removeElement(int[] nums, int val) {
        if(nums.length == 0) return 0;
        int j=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == val){
                if(j==0)
                    j=i+1;
                while(j<nums.length && nums[j] == val){
                    j++;
                }
                nums[i] = nums[j];
                j++;
            }
            else if(j>i && j<nums.length){
                nums[i] = nums[j];
            }
            else{
                j=i;
            }
        }
        System.out.println(j-1);
       return j-1; 
    }
	
	public int removeDuplicates(int [] nums) {
		int i=0;
        int duplicates = 0;
        while(i<nums.length){
            int j=i+1;
            while(j<nums.length && nums[i] == nums[j]){
                j++;
            }
            int k = i-j-1;
            for(int rep = 0; rep<k;rep++){
                int temp = nums[i+1];
                for(int z=i+1;z<nums.length-1;z++){
                    nums[z] = nums[z+1];
                }
                nums[nums.length-1] = temp;
            }
            duplicates += k;
            i++;
        }
        return nums.length - duplicates;
	}

	public static void main(String[] args) {
		RemoveDuplicatesFromSorted rem = new RemoveDuplicatesFromSorted();
		int [] nums = new int[] {1};
		rem.removeElement(nums, 1);
		
		
		

	}

}
