class Solution {
    public int solution(int[] num_list) {
        int answer = (num_list.length >= 11 ? 0 : 1);
        
        // 리스트 길이가 11 이상일 경우
        if(num_list.length >= 11) {
            for(int i=0; i<num_list.length; i++) {
                answer += num_list[i];
            }
        } else {
            for(int i=0; i<num_list.length; i++) {
                answer *= num_list[i];
            }
        }
        
        
        return answer;
    }
}