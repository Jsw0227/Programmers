import java.util.*;

public class Solution {
    public int solution(int n) {
        String A = String.valueOf(n);
        int answer = 0;
        
        for(char c : A.toCharArray()){
            answer += c -'0';

        }




        return answer;
    }
}