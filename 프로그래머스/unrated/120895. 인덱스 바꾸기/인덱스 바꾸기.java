class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";

        char[] chars = my_string.toCharArray();

        chars[num1] = my_string.charAt(num2);
        chars[num2] = my_string.charAt(num1);

        answer = String.valueOf(chars);

        return answer;
    }
}