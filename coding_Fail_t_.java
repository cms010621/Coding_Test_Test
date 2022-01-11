import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.Map.Entry;

public class coding_Fail_t_ {
    public static void main(String[] args) {
        int N = 4;
        int[] stages = {4,4,4,4,4};
        int people = stages.length;
        List<Integer> intList  = Arrays.stream(stages).boxed().collect(Collectors.toList());
        Map<Integer, BigDecimal> testMap = new HashMap<>();
        
        for(int i = 1; i <= N; i++) {
            testMap.put(i, people == 0 ? BigDecimal.ZERO : BigDecimal.valueOf(Collections.frequency(intList, i)).divide(BigDecimal.valueOf(people), 100, BigDecimal.ROUND_CEILING));
            people -= (Collections.frequency(intList, i));
        }

		List<Entry<Integer, BigDecimal>> list_entries = new ArrayList<Entry<Integer, BigDecimal>>(testMap.entrySet());

		Collections.sort(list_entries, new Comparator<Entry<Integer, BigDecimal>>() {
			public int compare(Entry<Integer, BigDecimal> obj1, Entry<Integer, BigDecimal> obj2)
			{
				return obj2.getValue().compareTo(obj1.getValue());
			}
		});

        int[] answer = new int[list_entries.size()];
        int index = 0;
		for(Entry<Integer, BigDecimal> entry : list_entries) {
            answer[index++] = entry.getKey();
		}

        System.out.println(Arrays.toString(answer));
    }
}
