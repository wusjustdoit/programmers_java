class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = true;
        boolean answer1 = true;
        boolean answer2 = true;


        answer1 = (x1 == true || x2 == true) ? true : false;
        answer2 = (x3 == true || x4 == true) ? true : false;
        answer = (answer1 == true && answer2 == true) ? true : false;

        return answer;
    }
}