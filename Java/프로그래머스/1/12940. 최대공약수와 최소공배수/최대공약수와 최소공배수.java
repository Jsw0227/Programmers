class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int max=0;
        int tmp=0;
        int min = 0;
        for(int i = 1;i<=n;i++){
            for(int j = 1; j<=m;j++){
                if(m % j ==0 && n%j ==0){
                    max = j;
                }
            }
        }
        
        answer[0]=max;
        answer[1]=n*m/max;
        
        
        return answer;
    }
}