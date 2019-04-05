package Algo.DynamicProgramming;

public class LongestPalindromicSubstring{

    public void LPS(String str){

        boolean[][] matDP=new boolean[str.length()][str.length()];
        int start=1;
        int maxLength=1;
        for (int i = 0; i < str.length(); i++) {
            matDP[i][i] = true;
        }

        for(int i= 0;i<str.length()-1;i++){
            if (str.charAt(i) == str.charAt(i + 1)) {
                matDP[i][i + 1] = true;
                start = i;
                maxLength = 2;
            }
        }

        for (int k = 3; k <= str.length(); k++) {
            for (int i = 0; i < str.length()-k+1; i++) {
                int end = i + k - 1;
                if (matDP[i + 1][end-1] && str.charAt(i) == str.charAt(end)) {
                    matDP[i][end] = true;
                    if(k>maxLength){
                        start = i;
                        maxLength = k;
                    }

                }
            }
        }
        String result = "";
        for (int i = start; i < start + maxLength; i++) {
            result = result + str.charAt(i);
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println((maxLength+ start) - start +" " +result);
    }


    public static void main(String args[]) {
        LongestPalindromicSubstring lps = new LongestPalindromicSubstring();
        lps.LPS("a");
    }

}