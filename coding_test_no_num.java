public class coding_test_no_num {
    public static void main(String[] args) {
        int[] numbers = {5,8,4,0,6,7,9};
        int answer = 45;

        for(int i=0;i<numbers.length; i++) {
            answer -= numbers[i];
        }

        System.out.println(answer);
    }
}
