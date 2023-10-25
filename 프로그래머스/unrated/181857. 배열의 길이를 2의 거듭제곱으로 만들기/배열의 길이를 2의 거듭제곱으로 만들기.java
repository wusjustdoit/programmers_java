class Solution {
    public int[] solution(int[] arr) {
        Double arrNum = 0d;

        // 2의 거듭제곱

        for(int i=0; i<=arr.length; i++) {
            if(arr.length <= Math.pow(2,i)) {
                arrNum = Math.pow(2,i);
                break;
            }
        }

        int[] answer = new int[(int)Math.round(arrNum)];

        System.arraycopy(arr, 0, answer, 0, arr.length);

        return answer;
    }
}