// you can also use imports, for example:
 import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        int l = A.length;
        //어레이가 1개 일때, 바로 반환
        if (l == 1) return A[0];
        
        // 우선 주어진 어레이 A를 정렬시킨다. 
        Arrays.sort(A,0,l);
        // 가장 큰 수가 다른 수면 미리 완료
        if (A[l-1]!=A[l-2]) return A[l];
        
        //정렬된 어레이에서 순차적으로 이전 값과 비교해 다른 수이며 홀수 일 경우, 그 값을 리턴한다 
        for (int i=0, count=0; i<l; i++){
            if (i == 0){
                count++;
                continue;
            }
            if (A[i] == A[i-1]) count++; 
            else if(count%2==0) count = 1;
            else return A[i-1];
            
        }
        // 에러 확인용 리턴값
        return -1;
    }
}
