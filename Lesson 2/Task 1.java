// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
//Scored 100% on Codility test
class Solution {
    public int solution(int[] A) {
        int result = 0;
        for(int a = 0; a < A.length; a++){
            result ^= A[a];
        }
        return result;
    }
}