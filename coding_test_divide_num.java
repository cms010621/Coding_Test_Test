import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class coding_test_divide_num {
    public static void main(String[] args) {
        int[] arr = {3,2,6};
        int divisor = 10;
        ArrayList<Integer> arrayList = new ArrayList<>();

        for(int i=0;i<arr.length; i++) {
            if(arr[i]%divisor == 0) {
                arrayList.add(arr[i]);
            }
        }
        Collections.sort(arrayList);

        int answer[] = new int[arrayList.size() ==0 ? 1 : arrayList.size()];
        for(int i=0;i<arrayList.size(); i++) {
            answer[i] = arrayList.get(i);
        }

        if(answer[0] == 0) answer[0] = -1;

        System.out.println(Arrays.toString(answer));
    }
}
