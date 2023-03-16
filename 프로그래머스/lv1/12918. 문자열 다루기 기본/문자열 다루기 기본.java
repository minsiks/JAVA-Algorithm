import java.util.*;
import java.util.stream.*;


class Solution {
    public boolean solution(String s) {
        boolean answer = false;
		
		if(s.length()==4||s.length()==6) {
			return isNumeric(s);
		}else
        return false;
    }
    public static boolean isNumeric(String s) {
      try {
          Integer.parseInt(s);
          return true;
      } catch(NumberFormatException e) {
          return false;
      }
    }
}