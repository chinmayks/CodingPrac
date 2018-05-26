package Algo.DynamicProgramming;
import java.util.ArrayList;

public class LongestCommonSubsequence {

    public void LCS(String x, String y){
        int[][] LCS_matrix = new int[y.length()+1][x.length()+1];

        for(int i=1; i<y.length()+1; i++){
            for(int j =1; j< x.length()+1; j++){

                if (i == 0 | j == 0){
                    LCS_matrix[i][j] = 0;
                }
                else if (x.charAt(j-1) == y.charAt(i-1)){
                    //System.out.println(x.charAt(j-1) +" "+ y.charAt(i-1));
                    LCS_matrix[i][j] = LCS_matrix[i-1][j-1] + 1;
                }
                else {
                    LCS_matrix[i][j] = Math.max(LCS_matrix[i-1][j], LCS_matrix[i][j-1]);
                }
            }
        }

        for(int i = 0;i<y.length()+1;i++){
            for(int j=0; j<x.length()+1;j++){
                System.out.print(LCS_matrix[i][j]+" ");
            }
            System.out.println();
        }
        ArrayList<Character> sequences = new ArrayList<>();
        // Backtracking
        int i = y.length();
        int j = x.length();

        while(i >0 && j> 0){
            if(LCS_matrix[i][j] == (LCS_matrix[i-1][j-1] +1)){
                sequences.add(x.charAt(j-1));
                i--;
                j--;
            }
            else if (LCS_matrix[i][j] == LCS_matrix[i-1][j]){
                i--;
            }
            else {
                j--;
            }
        }

        for(Character c: sequences){
            System.out.print(c +" ");
        }
    }



    public static void main(String args[]){

        LongestCommonSubsequence lcs = new LongestCommonSubsequence();
        lcs.LCS("AGGTAB", "GXTXAYB");

    }
}
