import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> A = new ArrayList<>();
        do{
            if(n%2==0){
                A.add(n);
                n = n/2;
            }else{
                A.add(n);
                n = (3*n)+1;
            }
        }while(n!=1);
        A.add(n);
        int[] answer = new int[A.size()];
        for(int i=0;i<A.size();i++){
            answer[i] = A.get(i);
        }
        return answer;
    }
}