/*
package com.kalyani.moviecatalogservice;

public class Rotate {
    public static void main(String[] args) {
        Rotate rg=new Rotate();
        rg.solution(new int[]{1,2,3,4,5},2);
    }
    public int[] solution(int[] A, int K) {
        // write your code in Java SE 8 1,2,3,4,5  2
        if(A.length==0||A.length==1 || K==0 || K==A.length ){
            return A;
        }

        else {
            while(K>A.length){
                K=K-A.length;
            }
            int i = A.length - K;
            int first[] = new int[K];
            int second[] = new int[i];
            int result[] = new int[A.length];
            for (int j = i, k = 0; j < A.length; j++, k++) {
                first[k] = A[j];
            }
            for (int j = 0; j < i; j++) {
                second[j] = A[j];
            }
            for (int p = 0; p < first.length; p++) {
                result[p] = first[p];
            }
            for (int q = 0; q < second.length; q++) {
                result[first.length + q] = second[q];
            }
            return result;

        }
    }
}
*/
