class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;

        if(h == 0) { // 가장 왼쪽 즐
            if(w == 0) {
                if(board[0].length > 1) answer += test(board[0][0], board[0][1]);
                if(board.length > 1) answer += test(board[0][0], board[1][0]);
            }else if(w == board[0].length-1){
                answer += test(board[0][w], board[0][w-1]);
                answer += test(board[0][w], board[1][w]);
            }else{
                answer += test(board[0][w], board[0][w-1]);
                answer += test(board[0][w], board[0][w+1]);
                answer += test(board[0][w], board[1][w]);
            }
        }else if(h == board.length-1){ // 가장 오른쪽 줄
            if(w == 0) {
                answer += test(board[h][0], board[h][1]);
                answer += test(board[h][0], board[h-1][0]);
            }else if(w == board[0].length-1){
                answer += test(board[h][w], board[h][w-1]);
                answer += test(board[h][w], board[h-1][w]);
            }else{
                answer += test(board[h][w], board[h][w-1]);
                answer += test(board[h][w], board[h][w+1]);
                answer += test(board[h][w], board[h-1][w]);
            }
        }else if(w == 0){
            answer += test(board[h][0], board[h-1][0]);
            answer += test(board[h][0], board[h+1][0]);
            answer += test(board[h][0], board[h][1]);
        }else if(w == board[0].length-1){
            answer += test(board[h][w], board[h-1][w]);
            answer += test(board[h][w], board[h+1][w]);
            answer += test(board[h][w], board[h][w-1]);
        }else{
            answer += test(board[h][w], board[h-1][w]);
            answer += test(board[h][w], board[h+1][w]);
            answer += test(board[h][w], board[h][w-1]);
            answer += test(board[h][w], board[h][w+1]);
        }


        return answer;
    }
    
    public int test(String a , String b){
        if(a.equals(b)){
            return 1;
        }else{
            return 0;
        }
    }
}