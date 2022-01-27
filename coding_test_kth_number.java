import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class coding_test_kth_number {
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int[] answer = new int[commands.length];

        ArrayList<Integer> arrayList = new ArrayList<>();

        for(int temp : array){
          arrayList.add(temp);
        }

        List<Integer> testList = new ArrayList<>();
        int index=  0;

        for(int[] temp : commands) {
            testList = (ArrayList<Integer>) arrayList.clone();
            testList = testList.subList(temp[0]-1, temp[1]);
            Collections.sort(testList);
            answer[index++] = testList.get(temp[2]-1);
        }
        
        System.out.println(Arrays.toString(answer));
    }
}
