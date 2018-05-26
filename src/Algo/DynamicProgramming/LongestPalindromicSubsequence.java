package Algo.DynamicProgramming;

public class LongestPalindromicSubsequence {

    public void LPS(String str){

        int[][] matDP = new int[str.length()][str.length()];

        for(int i=0; i<str.length();i++){
            matDP[i][i] = 1;
        }

        for(int i=0; i<str.length()-1;i++){
            if(str.charAt(i) == str.charAt(i+1)) {
                matDP[i][i + 1] = 1;
            }
        }

        for(int k=3; k<= str.length(); k++){
            for(int i=0; i<str.length()-k+1; i++){
                int j = str.length() - k +1;
                if(str.charAt(i) == str.charAt(j)){
                    matDP[i][j] = 2 + matDP[i+1][j-1];

                }
                else {
                    matDP[i][j] = Math.min(matDP[i][j-1], matDP[i+1][j]);
                }
            }
        }
        System.out.println(matDP[0][str.length()-1]);

    }

    public static void main(String args[]){
        LongestPalindromicSubsequence lps = new LongestPalindromicSubsequence();
        lps.LPS("axcacya");

    }
}
