import java.util.*;

class Solution {
    public String solution(String s) {
        char[] abc = s.toCharArray();
	        String answer = "";
	        
	        for(int i=0; i<abc.length; i++){
	            if((s.length()-s.replace(Character.toString(abc[i]), "").length())==1)
	                answer+=abc[i];
	        }
	        char[] chars = answer.toCharArray();
	        Arrays.sort(chars);
	        answer = new String(chars);
	        
	        return answer;
    }
}