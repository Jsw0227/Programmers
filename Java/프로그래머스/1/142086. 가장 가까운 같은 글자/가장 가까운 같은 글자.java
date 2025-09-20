class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        
        for(int i=0; i<s.length();i++){
            char a = s.charAt(i);
            int A = -1;
            
            for(int j=0; j<i;j++){
                if(a==s.charAt(j)){
                    A = j;
                }
            }
            
            if(A==-1)
                answer[i] = A;
            else{
                answer[i] = i-A;
            }
            
        }
        
        return answer;
    }
}