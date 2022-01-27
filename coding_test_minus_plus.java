public class coding_test_minus_plus {
    public static void main(String[] args) {
        int[] absolutes = {1,2,3};
        boolean[] signs = {false,false,true};
        int answer = 0;

        for(int i=0;i<absolutes.length; i++) {
            answer += (signs[i] ? absolutes[i] : absolutes[i]*-1);
        }
        System.out.println(answer);
    }
}
