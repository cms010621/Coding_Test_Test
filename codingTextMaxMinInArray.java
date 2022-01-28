import java.util.ArrayList;
import java.util.Collections;

public class codingTextMaxMinInArray {
    public static void main(String[] args) {
        int[] A = {1,2};
        int[] B = {3,4};

        ArrayList<Integer> aArrayList = new ArrayList<>();
        ArrayList<Integer> bArrayList = new ArrayList<>();

        int sum = 0;

        for(int i=0;i<A.length; i++) {
            aArrayList.add(A[i]);
            bArrayList.add(B[i]);
        }

        Collections.sort(aArrayList, Collections.reverseOrder());
        Collections.sort(bArrayList);

        for(int i=0;i<aArrayList.size(); i++) {
            sum += aArrayList.get(i) * bArrayList.get(i);
        }
        System.out.println(sum);
    }
}
