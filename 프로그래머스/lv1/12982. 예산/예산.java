import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);  // 신청한 금액을 오름차순으로 정렬
        int count = 0;
        for (int amount : d) {
            if (budget >= amount) {  // 예산이 신청한 금액보다 크거나 같으면 부서 선택
                budget -= amount;
                count++;
            } else {
                break;  // 예산이 신청한 금액보다 작으면 더 이상 부서 선택 불가
            }
        }
        return count;
    }
}