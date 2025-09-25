class Solution {
    public int solution(int[] wallet, int[] bill) {

        int answer = 0;
        if(wallet[0]>wallet[1]){
            int tmp=wallet[0];
            wallet[0] = wallet[1];
            wallet[1] = tmp;
        }
        if(bill[0]>bill[1]){
            int tmp=bill[0];
            bill[0] = bill[1];
            bill[1] = tmp;
        }
        
        while(bill[0]>wallet[0] || bill[1]>wallet[1]){
            bill[1] = bill[1] / 2;
            if(bill[0]>bill[1]){
                int tmp=bill[0];
                bill[0] = bill[1];
                bill[1] = tmp;
            }
            
            answer++;
        }
        
        return answer;
    }
}