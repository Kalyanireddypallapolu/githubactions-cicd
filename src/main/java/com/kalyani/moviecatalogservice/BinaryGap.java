/*
package com.kalyani.moviecatalogservice;

public class BinaryGap {
    public static void main(String[] args) {
      BinaryGap bg=new BinaryGap();
      bg.solution(1049);
    }
    public int solution(int N){
        // write your code in Java SE 8
       String binary= Integer.toBinaryString(N);
       String[] gaps=binary.replaceAll("0+$","").split("1");
        int maxGap = 0;
       for(String gap:gaps){
           if(gap.length()!=0 && gap.length()>maxGap){
               maxGap=gap.length();
           }
       }

        return maxGap;
    }
}
*/
