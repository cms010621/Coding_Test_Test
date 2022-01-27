import java.util.ArrayList;
import java.util.Arrays;

public class codingTestRemoveSmallist {
    public static void main(String[] args) {
        int[] arr = {10};
        int min = 2000000000;
        int minIndex = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i=0;i<arr.length; i++) {
            if(min > arr[i]) {
                min = arr[i];
                minIndex = i;
            }
            arrayList.add(arr[i]);
        }
        arrayList.remove(minIndex);
        int[] answer = new int[arr.length == 1 ? 1 : arr.length-1];
        for(int i=0;i<arrayList.size(); i++) {
            answer[i] = arrayList.get(i);
        }
        if(arr.length == 1) answer[0] = -1;

        System.out.println(Arrays.toString(answer));


    }
}
