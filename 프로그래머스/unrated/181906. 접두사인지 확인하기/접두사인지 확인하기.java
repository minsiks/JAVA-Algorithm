class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        int length = 0;
        if(is_prefix.length()<=my_string.length()) {
            length = is_prefix.length();
        }
        if(is_prefix.equals(my_string.substring(0, length))) {
            answer = 1;
        }
	        
        return answer;
    }
}