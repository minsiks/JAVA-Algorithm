import java.util.stream.*;
import java.util.*;

class Solution {
    public int[] solution(int n, int[] numlist) {
        return IntStream.of(numlist).filter(i->i%n==0).toArray();
    }
}