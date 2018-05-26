package Algo.DynamicProgramming;
import java.lang.Math.*;
import java.util.ArrayList;
public class MinimumEditDistance {

    public int MinEditDistance(String word1, String word2){

        int[][] DPmatrix = new int[word2.length()+1][word1.length()+1];
        DPmatrix[0][0] = 0;
        for(int i=1; i<word2.length()+1;i++){
            DPmatrix[i][0] = 	DPmatrix[i-1][0] + 1;
        }
        for(int i=1; i<word1.length()+1;i++){
            DPmatrix[0][i] = 	DPmatrix[0][i-1] + 1;
        }
        for(int i=1; i<word2.length()+1;i++){
            for(int j=1; j<word1.length()+1; j++){
                if(word2.charAt(i-1) == word1.charAt(j-1)){
                    DPmatrix[i][j] = DPmatrix[i-1][j-1];
                }
                else{
                    DPmatrix[i][j] =1 +  Math.min(DPmatrix[i-1][j-1], Math.min(DPmatrix[i][j-1], DPmatrix[i-1][j]) );
                }
            }
        }
// Backtracking
        ArrayList<Character> matches = new ArrayList<>();
        int i =word2.length();
        int j = word1.length();
        while(i>0 && j>0){

            if (DPmatrix[i-1][j-1] <= DPmatrix[i-1][j] && DPmatrix[i-1][j-1] <= DPmatrix[i][j-1]){
                matches.add(word1.charAt(j-1));
                i--;j--;
            }
            else if(DPmatrix[i-1][j] < DPmatrix[i-1][j-1] && DPmatrix[i-1][j] < DPmatrix[i][j-1]){
                i--;
            }

            else if(DPmatrix[i][j-1] < DPmatrix[i-1][j-1] && DPmatrix[i][j-1] < DPmatrix[i-1][j]){
                j--;
            }
            else {
                matches.add(word1.charAt(j-1));
                i--; j--;
            }
        }
        System.out.println(matches.toString());
        System.out.println(DPmatrix[word2.length()][word1.length()]);

        return DPmatrix[word2.length()][word1.length()];
    }

    public static void main(String args[]){
        MinimumEditDistance edit = new MinimumEditDistance();
        edit.MinEditDistance("abcdef", "azced");

    }
}

