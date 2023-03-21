import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;
		String bl = Stream.of(before.split(""))
            .sorted().collect(Collectors.joining());
		String al = Stream.of(after.split(""))
            .sorted().collect(Collectors.joining());
		
		if(bl.equals(al))
			answer = 1;
        return answer;
    }
}