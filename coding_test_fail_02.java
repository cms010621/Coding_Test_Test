import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class coding_test_fail_02 {
    public static void main(String[] args) {
        int N = 5;
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
        int people = stages.length;
        List<Integer> intList  = Arrays.stream(stages).boxed().collect(Collectors.toList());
        double[][] arr = new double[501][2];
        BigDecimal hh = new BigDecimal("0");
        BigDecimal ss = new BigDecimal("0");
        BigDecimal res = new BigDecimal("0");
        
        for(int i = 1; i <= N; i++) {
            hh = BigDecimal.valueOf(Collections.frequency(intList, i));
            ss = BigDecimal.valueOf(people);
            res = hh.divide(ss, 100,RoundingMode.CEILING);

            arr[i][0] = res.doubleValue();
            arr[i][1] = i;
            people -= (Collections.frequency(intList, i));
        }
        Arrays.sort(arr,new Comparator<double[]>() {
            
            @Override
            public int compare(double[] o1, double[] o2) {
                if(o1[0]==o2[0]) return Double.compare(o1[1], o2[1]);
                else return Double.compare(o2[0], o1[0]);
                
            }
        });
        List<Integer> tt = new ArrayList<>();
        for(int i=0;i<arr.length; i++) {
            if(arr[i][1] != 0) {
                tt.add((int)arr[i][1]); 
            }
        }

        int[] answer = tt.stream().mapToInt(i->i).toArray();
        System.out.println(Arrays.toString(answer));
    }
}
