import java.util.stream.*;

class Solution {
    public int solution(int left, int right) {
        return (int) IntStream
            .rangeClosed(left,right)
            .mapToLong(i->IntStream
                       .rangeClosed(1, i)
                       .filter(num->i%num==0)
                       .count()%2==0?i:-i)
            .sum();
    }
}