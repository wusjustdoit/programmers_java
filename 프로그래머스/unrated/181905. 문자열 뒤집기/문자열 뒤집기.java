class Solution {
    public String solution(String my_string, int s, int e) {
        String reverse = my_string.substring(s, e+1);
        String reversedStr = "";

        System.out.println(reverse);

        String answer1 = my_string.substring(0, s);
        String answer2 = my_string.substring(e+1);

        for(int i=reverse.length(); i>0; i--) {
            reversedStr += reverse.charAt(i-1);
        }

        return answer1 + reversedStr + answer2;
    }
}