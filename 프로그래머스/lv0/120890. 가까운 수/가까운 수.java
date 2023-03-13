import java.util.*;
import java.util.stream.Collectors;
import java.lang.Math;

class Solution {
    public int solution(int[] array, int n) {
        int asInt = Arrays.stream(array)
            .map(i -> Math.abs(i - n)).min().getAsInt();

        return Arrays.stream(array).boxed()
            .collect(Collectors.toList())
            .contains(n - asInt) ? n - asInt : n + asInt;
    }
}