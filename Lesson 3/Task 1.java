// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
//Scored 100% on Codility test
class Solution {
    public int solution(int X, int Y, int D) {
        int distance = Y - X;
        return (distance + D - 1) / D;
    }
}