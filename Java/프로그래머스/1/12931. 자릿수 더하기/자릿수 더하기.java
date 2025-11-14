import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer =0;
        String sNum = Integer.toString(n);
        int[] a = new int[sNum.length()];
        for(int i=0;i<sNum.length();i++){
            a[i] = sNum.charAt(i)-'0';
        }


        List<Integer> number = new ArrayList<Integer>();
        for(int i = 0; i < a.length; i++){
            number.add(a[i]);
        }
        
        for(int i = 0; i < number.size(); i++){
            answer += number.get(i);
        }


        return answer;
    }
}