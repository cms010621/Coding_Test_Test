public class coding_test_only_number {
    public static void main(String[] args) {
        String s = "1234";
        String a = s.replaceAll("[^0-9]", "");
        boolean answer = true;
        System.out.println(a);

        if(s.length() != a.length()) {
            answer = false;
        }
        if(a.length() != 4 && a.length() != 6) {
            answer = false;
        }
        System.out.println(answer);
    }
}
