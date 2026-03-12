class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
            // a : 97 ~ z : 122
            for(int i = 0 ; i < s.length(); i++){
            int num = (int) s.charAt(i);
            
            // 기존 count 로직 제거하고, 한 칸씩 이동
            int moved = 0;
            while(moved < index){
                num++;
                if(num > 122){
                    num = 97;  // a부터 다시
                }
                // skip에 없으면 moved 증가
                if(skip.indexOf((char)num) == -1){
                    moved++;
                }
            }
            
            answer += (char) num;
        }
        
        return answer;
    }
}