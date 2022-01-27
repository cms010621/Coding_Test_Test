import java.util.Arrays;

public class codingTestPlusEachNumber {
    public static void main(String[] args) {
        int n = 123;
        String[] arr = String.valueOf(n).split("");
        int answer = 0;

        for(int i=0;i<arr.length; i++) {
            answer += Integer.parseInt(arr[i]);
        }        
        System.out.println(answer);
    }
}
