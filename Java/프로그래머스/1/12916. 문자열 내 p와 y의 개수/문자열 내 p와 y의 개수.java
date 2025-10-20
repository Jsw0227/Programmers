class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int pnum = 0;
        int ynum = 0;
        
        for(int i = 0; i < s.length();i++){
            char a = s.charAt(i);
            if(a == 'p'|| a=='P'){
                pnum++;
            }else if(a == 'y' || a == 'Y'){
                ynum++;
            }
        }
        
        if(pnum != ynum){
            answer = false;
        }
        return answer;
    }
}