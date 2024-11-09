class Solution {
    public int solution(double flo) {
        // double 값을 문자열로 변환
        String floString = Double.toString(flo);

        // 마지막 '.'의 인덱스를 찾음
        int lastDotIndex = floString.lastIndexOf(".");

        // 소수점 앞의 정수 부분만 반환
        int answer = lastDotIndex != -1 ? Integer.parseInt(floString.substring(0, lastDotIndex)) : (int) flo;

        return answer;
    }
}