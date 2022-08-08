public class codingTestCenterChar {
    public static void main(String[] args) {
        String s = "abcde";
        String answer = "";
        int length = s.length();

        if(length%2 == 0) {
            answer = s.substring((length/2)-1, (length/2) + 1);
        } else {
            answer = String.valueOf(s.charAt(length/2));
        }
        System.out.println(answer);
    }
}
