import java.util.stream.*;
import java.util.*;

class Solution {
    public int solution(int i, int j, int k) {
        int result = 0;
        
        for(int a=i; a<=j; a++){
            String[] st= Integer.toString(a).split("");
            for(int b=0; b<st.length; b++){
                if(st[b].equals(Integer.toString(k))){
                    result++;
                    }
                }    
        }
       return result;
    }
}