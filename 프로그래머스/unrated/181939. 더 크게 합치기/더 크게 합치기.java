class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String aStr = Integer.toString(a);
        String bStr = Integer.toString(b);
        
        if(Integer.parseInt(aStr+bStr) >= Integer.parseInt(bStr+aStr)){
            answer = Integer.parseInt(aStr+bStr);
        }else{
            answer = Integer.parseInt(bStr+aStr);
        }
        
        return answer;
    }
}