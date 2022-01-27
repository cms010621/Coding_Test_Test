import java.math.BigInteger;
import java.util.*;

public class coding_test_220111 {
    
    public static void main(String args[]) {

        String[] answer = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
        List<Map<String, String>> arr =  new ArrayList<Map<String, String>>();
        Map<String, String> map = new HashMap<String, String>();
        map.put("id", "");
        map.put("nickName", "");
        arr.add(map);


        ArrayList<String> list = new ArrayList<String>(Arrays.asList(answer));

        for(int i = 0; i<list.size(); i++) {
            int flag = 0;
            if(list.get(i).contains("Enter") || list.get(i).contains("Change")) {
                for(int j = 1; j<arr.size(); j++) {
                    if(list.get(i).contains("Change") && arr.get(j).get("id").equals(list.get(i).split(" ")[1])) {
                        arr.get(j).set
                    } else if(arr.get(j).get("id").equals(list.get(i).split(" ")[1])) 
                        flag = 1;
                }
                if(flag == 0){
                    System.out.println(list.get(i).split(" ")[1]);
                    map = new HashMap<String, String>();
                    map.put("id", list.get(i).split(" ")[1]);
                    map.put("nickName", list.get(i).split(" ")[2]);
                    arr.add(map);
                }
            }
        }
        for(int i = 0;i<arr.size(); i++) {
            System.out.println(arr.get(i).get("nickName"));
        }


        // for(int i=0;i<list.size(); i++) {
        //     if(list.get(i).contains("Change")) {
        //         for(int j = 0;j<i; j++) {
        //             String[] text = list.get(j).split(" ");
        //             String[] cloneText = list.get(i).split(" ");
        //             if(text[1].equals(cloneText[1])) list.set(j, text[0] + " " + text[1] + " " + cloneText[2]);
        //         }
        //         list.remove(i);
        //     }
        // }

        // answer = list.toArray(new String[list.size()]);
        // System.out.println(Arrays.toString(answer));

    }
}