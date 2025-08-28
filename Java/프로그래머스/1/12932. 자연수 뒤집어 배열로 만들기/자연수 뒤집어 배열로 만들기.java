class Solution {
    public int[] solution(long n) {
        String s = String.valueOf(n);
        int[] answer = new int[s.length()];
        int i= s.length() -1;
        
        for(char c : s.toCharArray()){
                int a = c-'0';
                answer[i]=a;
                i--;
            }
        
        return answer;
    }
}