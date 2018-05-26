package Algo.LinkedList;

//you can also use imports, for example:
import java.util.*;

//you can write to stdout for debugging purposes, e.g.
//System.out.println("this is a debug message");

class Solution {
 public int solution(String A, String B) {
     // write your code in Java SE 8
     if(A.length() <= 1000 && B.length() <= 1000){
         int count =0;
         if(A.length() > B.length()){
             return -1;
         }
         else{
             StringBuilder stb = new StringBuilder(A).append(A);
             count = 2;
             while(stb.length() <= 2*(B.length())){
                 if(stb.toString().contains(B)){
                     return count;
                 }
                 stb.append(new StringBuilder(A));
                 count++;
             }
             
             
         }
     }
 
     return -1;  
 }
 public static void main(String args[]) {
	 Solution sol = new Solution();
	 
	 System.out.println(sol.solution("abcd", "cdabcdab"));
 }
}
