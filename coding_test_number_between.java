public class coding_test_number_between {
    public static void main(String[] args) {
        int a = 3;
        int b = 3;
        long answer = 0;

        int startNum = a-b > 0 ? b : a;
        int endNum = a-b > 0 ? a : b;

        for(int i = startNum;i<=endNum; i++) {
            answer += i;
        }

        System.out.println(answer);
    }
}
