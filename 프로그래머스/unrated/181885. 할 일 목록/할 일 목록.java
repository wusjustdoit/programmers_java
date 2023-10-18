class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        int notFinishedToDoNo = 0;

        for(boolean toDoResult : finished) {
            if(toDoResult == false)
                notFinishedToDoNo++;
        }

        String[] answer = new String[notFinishedToDoNo];
        int toDoNum = 0;
        for(int i=0; i<todo_list.length; i++) {
            if(finished[i] == false) {
                answer[toDoNum] = todo_list[i];
                toDoNum++;
            }
        }

        return answer;
    }
}