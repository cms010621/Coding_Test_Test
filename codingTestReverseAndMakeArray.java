import java.util.Arrays;

public class codingTestReverseAndMakeArray {
    public static void main(String[] args) {
        long n = 12345;
        StringBuffer stringBuffer = new StringBuffer(String.valueOf(n));
        stringBuffer = stringBuffer.reverse();
        String arr[] = stringBuffer.toString().split("");
        int[] answer = new int[arr.length];

        for(int i=0; i<arr.length; i++) {
            answer[i] = Integer.parseInt(arr[i]);
        }
        System.out.println(Arrays.toString(answer));
    }
}
