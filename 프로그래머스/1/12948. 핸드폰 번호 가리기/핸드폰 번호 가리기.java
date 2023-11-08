class Solution {
    public String solution(String phone_number) {
        String answer = "";

        char[] chars = phone_number.toCharArray();

        for(int i=0; i<chars.length; i++) {
            if(i < chars.length-4)
                answer += "*";
            else
                answer += chars[i];
        }

        return answer;
    }
}