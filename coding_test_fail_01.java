import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class coding_test_fail_01 {
    public static void main(String[] args) {
        int N = 2;
        int[] stages = {3,3,3,3,3};
        int people = stages.length;
        List<Integer> intList  = Arrays.stream(stages).boxed().collect(Collectors.toList());
        int[][] arr = new int[501][2];
        
        for(int i = 1; i <= N; i++) {
            arr[i][0] = (int)((double)(Collections.frequency(intList, i)/ (double) people)*10000000);
            arr[i][1] = i;
            people -= (Collections.frequency(intList, i));
        }
        Arrays.sort(arr,new Comparator<int[]>() {
            
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0]==o2[0]) return o1[1]-o2[1];
                else return o2[0]-o1[0];
            }
        });
        List<Integer> tt = new ArrayList<>();
        for(int i=0;i<arr.length; i++) {
            if(arr[i][1] != 0) {
                tt.add(arr[i][1]); 
            }
        }

        int[] answer = tt.stream().mapToInt(i->i).toArray();
        System.out.println(Arrays.toString(answer));
    }
}
