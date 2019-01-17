// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
//Scored 100% on Codility test
class Solution {
    public int solution(int[] A) {
        java.util.Arrays.sort(A);
        int next = 1;
            
        for(int a = 0; a < A.length; a++){
            if(A[a] > 0){
                if(A[a] > next)
                    return next;
                else if(A[a] == next)
                    next++;
            }
        }
        return next; 
    }
}