public class codingTestHidePhoneNumber {
    public static void main(String[] args) {
        String phone_number = "8888";
        String answer = "";
        int length = phone_number.length() - 4;
        for(int i=0;i<length; i++) {
            answer += "*";
        }
        answer += phone_number.substring(length, phone_number.length());
        System.out.println(answer);
    }
}
