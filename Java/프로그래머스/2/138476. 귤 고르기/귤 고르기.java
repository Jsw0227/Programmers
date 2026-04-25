import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i<tangerine.length; i++){
            if(map.containsKey(tangerine[i])){
                map.put(tangerine[i], map.get(tangerine[i])+1);
            }else{
                map.put(tangerine[i], 1);
            }
        }
        List<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list,(a,b) -> (map.get(b).compareTo(map.get(a))));
        int answer = 0;

        for(int key : list){
            k -= map.get(key);
            answer++;
            if(k<=0){
                break;
            }
        }

        return answer;
    }
}