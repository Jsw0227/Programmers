import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> answer = new ArrayList<>();
        for(int i = l; i<=r; i++){
            String s = String.valueOf(i);
            Boolean A = true;
            
            for(char c : s.toCharArray()){
                if(c != '5' && c != '0')
                    A = false;
            }
            if(A)
                answer.add(i);
            
         
            
        }
           if(answer.isEmpty())
                answer.add(-1);
        
        int[] result = new int[answer.size()];
        for (int i = 0; i < answer.size(); i++) {
            result[i] = answer.get(i);
        }
        return result;
    }
}