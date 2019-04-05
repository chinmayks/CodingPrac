package Algo.DynamicProgramming;

public class LongestIncreasingSubsequence {
    /**
     * LIS nLogn solution.
     * @param arr
     * @return
     */

    public int LIS(int[] arr){
        int length = 0;
        int[] subsequence = new int[arr.length];
        int[] positions = new int[arr.length];
        for(int i=0; i<positions.length;i++){
            positions[i] = -1;
        }
        subsequence[0] = 0;
        for(int i=1; i<arr.length;i++){
            if(arr[subsequence[length]] < arr[i]){
                length++;
                positions[i] = subsequence[length-1];
                subsequence[length] = i;

            }
            else if(arr[i] < arr[subsequence[0]]){
                subsequence[0] = i;

            }
            else {
                int pos = findCeiling(subsequence,0, length+1, arr[i], arr);
                subsequence[pos] = i;
                positions[i] = subsequence[pos -1];
            }
        }

        int lastNum = subsequence[length];
        int j = 0;
        while( j< length+1){
            if (lastNum!= -1) {
                System.out.print(arr[lastNum] + " ");
                lastNum = positions[lastNum];
                j++;
            }
            else {
                break;
            }
        }
        System.out.println();

        return length+1;
    }

    public int findCeiling(int[] subsequence,int x, int y, int value, int[] input){
        int pos = 0;
        int start = x;
        int end = y;
        int mid = (start + end)/2;

        if(mid <= end && value > input[subsequence[mid]] && value <= input[subsequence[mid + 1]]){
            pos =mid+1;
            return pos;
        }
        else if(value < input[subsequence[mid]]){
            return findCeiling(subsequence, start, mid-1, value, input);
        }
        else {
            return findCeiling(subsequence, mid+1, end, value, input);
        }


    }

    public static void main(String args[]){

        LongestIncreasingSubsequence lis = new LongestIncreasingSubsequence();
        int[] arr = new int[]{3,4,-1,5,8,2,3,12,7,9,10};
        System.out.println(lis.LIS(arr));
    }
}
