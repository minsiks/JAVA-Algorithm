class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length/n][n];
		int j = 0;
		for (int i = 0, k=0; i < num_list.length; i++,k++) {
			if(i!=0&&i%n==0) {
				k=0;
				j++;
			}
			answer[j][k] = num_list[i];
			
		}
        return answer;
    }
}