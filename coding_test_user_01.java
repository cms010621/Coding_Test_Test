import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class coding_test_user_01 {
    public static void main(String[] args) {
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int k = 2; //정지 기준
        int[] stop = new int[id_list.length];
        int[] answer = new int[id_list.length];
        Map<String, String> map = new HashMap<>();

        ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(report));
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        for(String item : arrayList){
            linkedHashSet.add(item);
        }

        /* */
        HashMap<String, String> ttMap = new HashMap<>();
        for(int i = 0; i < id_list.length; i++) {
            String res = "";
            for(String string : linkedHashSet) {
                String[] str = string.split(" ");
                if(str[0].equals(id_list[i])) {
                    res += res.equals("") ? str[1] :  "/"+str[1];
                }
            }

            ttMap.put(id_list[i], res);
        }

        System.out.println(ttMap);

        for(String string : linkedHashSet) {
            String[] str = string.split(" ");
            for(int i=0;i<id_list.length; i++) {
                if(id_list[i].equals(str[1])) {
                    stop[i] += 1;
                    break;
                }
            }
        }

        System.out.println(Arrays.toString(stop));

        for(int i=0;i<id_list.length; i++) {
            // ttMap.replace(id_list[i], ttMap.get(id_list[i].contains(s)).valueOf(stop[i]));
            map.put(id_list[i], String.valueOf(stop[i]));
        }
        
        String ss = ttMap.toString();

        for(int i=0;i<id_list.length; i++) {
            System.out.println(id_list[i]);
            System.out.println(map.get(id_list[i]));
            ss.replaceAll(id_list[i], map.get(id_list[i]));    
            System.out.println(ss);
        }
        System.out.println(map);
        System.out.println(ss);

        System.out.println(Arrays.toString(answer));
    }
    
}
