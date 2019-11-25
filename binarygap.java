// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int N) {
        int n = N;
        if (n<0) {
            System.out.println("do not input negatives");
            return -1;
        }
        int[] x = new int[32];
        
        int i=0, counter = 0, max = 0, ones = 0;
        
        // 이진수로 변환, 1의 자리 부터 계산 시작
        while (n!=1){
            x[i] = n%2;
            n = n/2;
            
            // 1이 보이는 경우 1 카운터를 올리고, 만약 1이 2개라면 
            // 현재 갭의 최대값과 카운터를 비교
            if (x[i] == 1) {
                ones++;
                if (counter > max && ones>=2) max = counter; 
                counter = 0; 
            }
            
            // 1이 보인 이후에 0 이 보인경우 카운터를 증가시킵니다 
            else if (x[i] == 0 && ones>=1) counter ++; 
            i++;
        }
        //첫번째 자리를 입력 후 카운터가 현재 max보다 큰 경우 체크 
        x[i] = n;
        if (n == 1 && max<counter) max = counter;
        return max;
    }
}
