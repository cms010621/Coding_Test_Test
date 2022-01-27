public class coding_test_3_reverse {
    public static void main(String[] args) {
        int n = 45;
        String reverse = "";
        int answer = 0;

        reverse = Integer.toString(n, 3);

        StringBuffer sb = new StringBuffer(reverse);
        reverse = sb.reverse().toString();

        answer = Integer.parseInt(reverse, 3);

        System.out.println(answer);
    }
}
