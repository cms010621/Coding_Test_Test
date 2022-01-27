import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map.Entry;

public class coding_test_user {
    public static void main(String[] args) {
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int k = 2; //정지 기준
        int[] stop = new int[id_list.length];
        int[] answer = new int[id_list.length];
        ArrayList<HashMap<String, String>> testList = new ArrayList<>();

        ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(report));
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        for(String item : arrayList){
            linkedHashSet.add(item);
        }

        /* */
        HashMap<String, String> ttMap = new HashMap<>();
        for(int i = 0; i < id_list.length; i++) {
            ttMap = new HashMap<>();
            String res = "";
            for(String string : linkedHashSet) {
                String[] str = string.split(" ");
                if(str[0].equals(id_list[i])) {
                    res += res.equals("") ? str[1] :  ","+str[1];
                }
            }

            ttMap.put(id_list[i], res);
            testList.add(ttMap);
        }

        for(String string : linkedHashSet) {
            String[] str = string.split(" ");
            for(int i=0;i<id_list.length; i++) {
                if(id_list[i].equals(str[1])) {
                    stop[i] += 1;
                    break;
                }
            }
        }

        // for(int i=0;i<id_list.length; i++) {

            // testList.get(0).get(key).replaceAll(id_list[i], String.valueOf(stop[i]));
            // System.out.println(ttMap);

        // }

        int index = 0;
        for(HashMap<String, String> hashMap:testList) {
            for(Entry<String, String> elem : hashMap.entrySet()){ 
                String value = elem.getValue();
                for(int i=0;i<stop.length; i++) {
                    
                }
                System.out.println("키 : " + elem.getKey() + "값 : " + elem.getValue()); 
            }

            index++;
            System.out.println(hashMap);
        }


        // for(int i=0;i<id_list.length; i++) {
            
        // }

        // int tot = 0;
        // for(String string : linkedHashSet) {
        //     String[] str = string.split(" ");
        //     tot = 0;
        //     for(int i=0;i<id_list.length; i++) {
        //         for(int j=0;j<stop.length; j++) {
        //             if(str[0].equals(id_list[i]) && str[1].equals(id_list[j]) && stop[j] >= k) {
        //                 answer[i] += 1;
        //                 tot = 1;
        //                 break;
        //             }
        //         }
        //         if(tot == 1) break;
        //     }
        // }

        System.out.println(Arrays.toString(answer));
    }
    
}
