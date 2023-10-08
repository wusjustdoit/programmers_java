class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length +1];

        int numLength = num_list.length;

        for(int i=0; i<num_list.length; i++) {
            answer[i] = num_list[i];
        }

        if(num_list[numLength-1] > num_list[numLength-2])
            answer[numLength] = num_list[numLength-1] - num_list[numLength-2];
        else
            answer[numLength] = num_list[numLength-1] * 2;

        return answer;
    }
}