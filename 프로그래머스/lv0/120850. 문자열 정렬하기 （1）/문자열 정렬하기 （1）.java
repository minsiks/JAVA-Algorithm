import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Collections;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


class Solution {
    public List<Integer> solution(String my_string) {
        char[] charArr = my_string.toCharArray();
		List<Integer> list = new ArrayList<>();
		for(int i=0; i<charArr.length; i++) {
			if(Character.isDigit(charArr[i])) {
				list.add(Character.getNumericValue(charArr[i]));
			}
		}
        Collections.sort(list);
        return list;
    }
}