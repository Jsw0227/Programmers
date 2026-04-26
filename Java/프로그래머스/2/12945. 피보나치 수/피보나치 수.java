import java.util.ArrayList;
class Solution {
    public int solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        for(int i = 2; i<=n;i++){
            int num = (list.get(i-2) + list.get(i-1)) % 1234567;
            list.add(num);
        }
        int answer = list.get(n);
        return answer;
    }

}