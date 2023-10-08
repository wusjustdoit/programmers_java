class Solution {
    public String[] solution(String my_string) {
        String my_string2 = "";
        my_string2 = my_string.replaceAll("\\s+"," ").trim();
        System.out.println(my_string2);

        return my_string2.split(" ");
    }
}