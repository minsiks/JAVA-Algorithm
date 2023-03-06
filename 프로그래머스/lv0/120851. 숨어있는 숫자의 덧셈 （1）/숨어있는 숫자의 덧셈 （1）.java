import java.util.*;

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        char[] charr = my_string.toCharArray();
        for (char c : charr) {
			if(Character.isDigit(c)) {
				answer += Character.getNumericValue(c);
			}
			
		}
        return answer;
    }
}