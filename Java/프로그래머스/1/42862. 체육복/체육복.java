class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] cloth = new int[n];

        for(int i = 0; i < reserve.length; i++){
            cloth[reserve[i]-1]++;
        }
        for(int i = 0; i < lost.length; i++){
            cloth[lost[i]-1]--;
        }

        for(int i = 0; i < n; i++){
            if(i==0){
                if(cloth[0]==-1 && cloth[1]==1){
                    cloth[0] = 0;
                    cloth[1] = 0;
                }
            }else if(i == n-1){
                if(cloth[n-1] == -1 && cloth[n-2] == 1){
                    cloth[n-1] = 0;
                    cloth[n-2] = 0;
                }
            }else{
                if(cloth[i] == -1){
                    if(cloth[i-1] == 1){
                        cloth[i] = 0;
                        cloth[i-1] = 0;
                    }else if(cloth[i+1] == 1){
                        cloth[i] = 0;
                        cloth[i+1] = 0;
                    }
                }
            }
        }
        int answer=0;
        for(int i = 0; i < n; i++){
            if(cloth[i] >= 0){
                answer++;
            }
        }
        return answer;
    }
}