// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
//Scored 100% on Codility test
class Solution {
    public int solution(int X, int[] A) {
        int[] B = new int[X + 1];
        int cont = 0;
        
        for(int a = 0; a < A.length; a++){
            if(B[A[a]] != 1){
                B[A[a]] = 1;
                cont++;
            }
            if(cont == X)
                return a;
        }
        return -1;
    }
}