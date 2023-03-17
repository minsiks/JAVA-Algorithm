import java.util.stream.*;

class Solution {
    public int solution(int n) {
        int answer = (int) IntStream
            .rangeClosed(1,n)
            .filter(i->IntStream
                    .rangeClosed(1,i)
                    .filter(j->i%j==0).count()>=3).count();
        return answer;
    }
}