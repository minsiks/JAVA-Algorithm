class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++) {
            	if(j*i>n) break;
            	if(j*i == n) answer++;
            }
        }
        return answer;
    }
}