class Solution {
    public String solution(String my_string) {
        char[] chars = my_string.toCharArray();

        StringBuilder sb = new StringBuilder();

        for(int i=my_string.length()-1; i>=0; i--) {
            sb.append(chars[i]);
        }

        return sb.toString();
    }
}