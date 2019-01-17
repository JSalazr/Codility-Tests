// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
//Scored 100% on Codility test
class Solution {
    private int abs(int value){
        return value < 0 ? -value : value; 
    }
    
    public int solution(int[] A) {
        int smallest = Integer.MAX_VALUE, partA = 0, partB = 0;
        
        for(int a : A)
            partB += a;

        for(int a = 0; a < A.length - 1; a++){
            partA += A[a];
            partB -= A[a];
            
            int difference = abs(partA - partB);
            if(difference < smallest)
                smallest = difference;
        }
        
        return smallest;
    }
}