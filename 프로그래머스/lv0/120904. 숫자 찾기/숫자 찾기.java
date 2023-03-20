class Solution {
    public int solution(int num, int k) {
        int answer = 0;
		String go = Integer.toString(num);
		char[] charr = go.toCharArray();
		char kStr = (char)(k+'0');
		
		for (int i = 0; i < charr.length; i++) {
			if(charr[i]==kStr) {
				answer = i+1;
				break;
			}else {
				answer = -1;
			}
		}
        return answer;
    }
}