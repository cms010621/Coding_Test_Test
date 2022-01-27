import java.util.ArrayList;
import java.util.Arrays;

public class coding_test_no_same_number {
    public static void main(String[] args) {
        int []arr = {1,1,3,3,0,1,1};
        ArrayList<Integer> arrayList = new ArrayList<>();
        int index = 0;

        arrayList.add(arr[0]);
        for(int i = 1; i<arr.length; i++) {
            if(arrayList.get(index) != arr[i]) {
                arrayList.add(arr[i]);
                index++;
            }
        }

        int []answer = new int[arrayList.size()];
        for(int i=0;i<arrayList.size(); i++) {
            answer[i] = arrayList.get(i);
        }
        System.out.println(Arrays.toString(answer));
    }
}
