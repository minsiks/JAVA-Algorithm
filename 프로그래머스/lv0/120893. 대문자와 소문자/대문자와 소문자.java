

class Solution {
    public String solution(String my_string) {
        String result = "";
		char[] rs =my_string.toCharArray();
		
		for (char c : rs) {
			if (65<=c && c<=90)
			{
				c +=32;
				result+=c;
			}

			else if(97<=c && c<=122)

			{
				c -=32;
				result+=c;
			}
		}
		return result;
    }
}