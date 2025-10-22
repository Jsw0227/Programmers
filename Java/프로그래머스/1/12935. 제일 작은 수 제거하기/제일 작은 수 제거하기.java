class Solution {
    public int[] solution(int[] arr) {
        int[] answer;
        int leng = arr.length;
        
        
        if(leng != 1){
            answer = new int[arr.length-1];
            int A = arr[0];
            int seq=0;
            
             for(int i = 0;i<leng;i++){
                if(A>arr[i]){
                    A=arr[i];
                    seq = i;
                }
            }
            System.out.print(seq);
            
            for(int i = 0; i <seq;i++){
                answer[i] = arr[i];
            }
            for(int i = seq+1;i<arr.length;i++){
                answer[i-1] = arr[i];
            }
            
        }else{
            
            answer = new int[]{-1};
        }
        return answer;
    }
}