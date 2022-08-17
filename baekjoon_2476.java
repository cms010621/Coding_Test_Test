import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class baekjoon_2476 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
        int num = Integer.parseInt(bf.readLine());
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        for(int i=0; i<num; i++) {
            String[] str = bf.readLine().split(" ");
            arrayList.add(Integer.parseInt(str[0]));
            arrayList.add(Integer.parseInt(str[1]));
            arrayList.add(Integer.parseInt(str[2]));

            Collections.sort(arrayList);

            if(arrayList.get(0) == arrayList.get(2)) {
                arr.add(10000 + (arrayList.get(0) * 1000));
            } else if(arrayList.get(0) == arrayList.get(1)) {
                arr.add(1000 + (arrayList.get(0) * 100));
            } else if(arrayList.get(1) == arrayList.get(2)) {
                arr.add(1000 + (arrayList.get(1) * 100));
            } else {
                arr.add(arrayList.get(2) * 100);
            }
            arrayList.clear();
        }

        Collections.sort(arr);

        bw.write(arr.get(num-1)+"");
        bw.flush();
        bf.close();
    }
}