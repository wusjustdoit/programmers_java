class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "fail";

        String id = id_pw[0];
        String pw = id_pw[1];

        for(int i=0; i<db.length; i++) {
            if(id.equals(db[i][0]) && pw.equals(db[i][1])) {
                answer = "login";
                break;
            } else if(id.equals(db[i][0])) {
                if(!pw.equals(db[i][1])) {
                    answer = "wrong pw";
                    break;
                }
            }
        }

        return answer;
    }
}