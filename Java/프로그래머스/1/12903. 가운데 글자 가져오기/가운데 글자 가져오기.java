class Solution {
    public String solution(String s) {
        int num = s.length()/2;
        String answer = "";
        
        if(s.length() % 2 == 0){
            answer += s.charAt(num-1);
            answer += s.charAt(num);
        }else{
            answer += s.charAt(num);
        }
        
        return answer;
    }
}