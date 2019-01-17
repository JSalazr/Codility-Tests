// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
//Scored 100% on Codility test
class Solution {
    public int solution(int N) {
        int biggest = 0, current = 0;
        while(N % 2 == 0){
            N /= 2;
        }
        
        while(N > 0){
            if(N % 2 == 1){
                if(biggest < current)
                    biggest = current;
                current = 0;
            }else{
                current++;
            }
            N /= 2;
        }
        
        return biggest;
    }
}