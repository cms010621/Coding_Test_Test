import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class codingTestSortEachNumber {
    public static void main(String[] args) {
        long n= 118372;
        String[] arr = String.valueOf(n).split("");
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(arr));
        Collections.sort(arrayList, Collections.reverseOrder());
        long answer = 0;
        String ans = "";
        for(String s:arrayList) {
            ans += s;
        }
        answer = Long.valueOf(ans);
        System.out.println(answer);
    }
}
