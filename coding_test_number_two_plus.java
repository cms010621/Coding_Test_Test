import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class coding_test_number_two_plus {
    
    public static void main(String []args) {
        int[] numbers = {5,0,2,7};
        ArrayList<Integer> arrayList = new ArrayList<>();

        for(int i = 0; i<numbers.length-1; i++) {
            for(int j=i+1; j<numbers.length; j++) {
                arrayList.add(numbers[i]+numbers[j]);
            }
        }

        Collections.sort(arrayList);
        TreeSet<Integer> treeSet = new TreeSet<>();

        for(int i : arrayList) {
            treeSet.add(i);
        }

        int[] answer = new int[treeSet.size()];
        Iterator<Integer> it = treeSet.iterator();
        int index = 0;
        
        while(it.hasNext()) {
            answer[index++] = it.next();
        }

        System.out.println(Arrays.toString(answer));

    }
}
