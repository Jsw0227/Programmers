class Solution {
    public int solution(int n) {
        int answer = 0;

        // 1부터 n까지 각 숫자를 시작값으로 하여 연속합을 구함
        for (int i = 1; i <= n; i++) {
            int sum = 0;

            // i부터 시작해서 연속된 자연수를 더해감
            for (int j = i; j <= n; j++) {
                sum += j;

                // 합이 n과 같아지면 경우의 수 추가
                if (sum == n) {
                    answer++;
                    break;
                } 
                // 합이 n을 넘어서면 더 이상 연속합을 만들 수 없으므로 탈출
                else if (sum > n) {
                    break;
                }
            }
        }

        return answer;
    }
}