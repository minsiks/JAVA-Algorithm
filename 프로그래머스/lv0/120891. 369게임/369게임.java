import java.util.stream.*;

class Solution {
    public int solution(int order) {
        int answer = (int)Stream.of(Integer.toString(order).split(""))
            .filter(s->s.equals("3")||s.equals("6")||s.equals("9")).count();
        return answer;
    }
}