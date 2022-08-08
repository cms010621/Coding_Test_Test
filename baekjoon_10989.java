import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.io.IOException; 

public class baekjoon_10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
        Map<String, Integer> arr = new HashMap<String, Integer>();

        int cnt = Integer.parseInt(bf.readLine());
        String num = "";

        for(int i=0; i<cnt; i++) {
            num = bf.readLine();
            String s = String.valueOf(arr.get(num));  
            if(s.equals("null")) {
                arr.put(num, 1);
            } else {
                arr.replace(num, Integer.parseInt(s)+1);
            }
        }

        Object[] mapKey = arr.keySet().toArray();
        Arrays.sort(mapKey);

        for( Map.Entry<String, Integer> elem : arr.entrySet()){
            cnt = elem.getValue();
            for(int i=0; i<cnt; i++) {
                bw.write(elem.getKey()+"\n");
            }
        }

        bw.flush();
        bf.close();

    }
}
