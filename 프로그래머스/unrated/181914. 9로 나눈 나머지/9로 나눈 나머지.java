class Solution {
    public int solution(String number) {
        int answer = 0;
        String[] numberList = number.split("");
        for(int i=0; i<numberList.length; i++) {
            answer += Integer.parseInt(numberList[i]);
        }
        return answer % 9;
    }
}