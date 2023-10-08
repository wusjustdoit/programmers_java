class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;

        if(arr1.length != arr2.length) {
            answer = arr1.length > arr2.length ? 1 : -1;
        } else {
            int arr1Num = 0;
            int arr2Num = 0;
            for(int num : arr1) arr1Num += num;
            for(int num : arr2) arr2Num += num;

            answer = arr1Num > arr2Num ? 1 : (arr1Num<arr2Num) ? -1 : 0;
        }

        return answer;
    }
}