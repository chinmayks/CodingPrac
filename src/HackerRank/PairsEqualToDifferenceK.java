//package HackerRank;
//
//import java.util.HashMap;
//import java.util.Scanner;
//
//public class PairsEqualToDifferenceK {
//
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//        int N = in.nextInt();
//        int k = in.nextInt();
//        HashMap<Long, Integer> hmap =  new HashMap<Long, Integer>();
//        if(N>= 2 && N<= 100000 && k >0 && k<1000000000){
//            int countPair = 0;
//            for(int i=0; i<N;i++){
//                Long n = in.nextLong();
//                if(hmap.containsKey(Math.abs(k-n))){
//                	
//                    countPair++;
//                    
//                }
//                if(hmap.containsKey(Math.abs(k+n))) {
//                	countPair++;
//                	
//                }
//               hmap.put(n,i);
//                
//            }
//            System.out.println(countPair);
//        }
//
//	}
//
//}
//
//
//
//if(a[0][0] == 0 || a[M-1][N-1] ==0){
//    return 0;   
//}
//
//
//
//int[][] result = new int[M][N];
//result[0][0] = 1;
//for(int i=1;i<M;i++){
//    if(a[i][0] == 0){
//        result[i][0] = 0;
//    }
//    else{
//        result[i][0] = result[i-1][0];
//    }
//}
//
//for(int i=1;i<N;i++){
//    if(a[0][i] == 0){
//        result[0][i] = 0;
//    }
//    else{
//        result[0][i] = result[0][i-1];
//    }
//}
//
//for(int i=1; i<M;i++){
//    for(int j=1;j<N;j++){
//        if(a[i][j] == 0){
//            result[i][j] =1;
//        }
//        else{
//            result[i][j] = result[i-1][j] + result[i][j-1];
//        }
//    }
//}
//
//return result[M-1][N-1];
//
//
//
//
//
//Scanner in = new Scanner(System.in);
//int N = in.nextInt();
//int[] input = new int[N];
//for(int i=0; i<N;i++){
//    input[i] = in.nextInt();
//}
//double res = (double)Integer.MIN_VALUE;
//int left = 0, right=0;
//int no1 = 0;
//
//for(int i=0;i<N;i++){
//    int n0 =0, n1 =0;
//    if(input[i] == 0){
//        n0++;
//        for(int j=i+1; j<N;j++){
//            if(input[j] == 0){
//                n0++;
//            }
//            else{
//                n1++;
//            }
//            if(n1 != 0){
//                double r = n0/n1;
//                if(r >= res){
//                    left = i;
//                    right =j;
//                    res = r;
//                    no1 = n0;
//                }
//            }
//        }
//        
//    }
//}
//System.out.println(no1);   
//
//
//
//
//
