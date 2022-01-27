import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;

public class coding_test_string_sort {
    public static void main(String[] args) {
        String s = "Zbcdefg";
        byte[] bytes = s.getBytes(StandardCharsets.US_ASCII);
        ArrayList<Integer> arr = new ArrayList<>();
        String answer = "";

        for(int i=0;i<bytes.length; i++) {
            arr.add(Integer.parseInt(String.valueOf(bytes[i])));
        }
        Collections.sort(arr, Collections.reverseOrder());
        System.out.println(arr);

        for(int i=0;i<arr.size(); i++) {
            int n = arr.get(i);
            answer += (char) n;
        }

        System.out.println(answer);



        // System.out.println(answer);
    }
}
