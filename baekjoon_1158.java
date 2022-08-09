import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;

public class baekjoon_1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  

        String[] arr = bf.readLine().split(" ");
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();

        for(int i=1; i<=Integer.parseInt(arr[0]); i++) {
            arrayList.add(i);

        }

        int cnt = Integer.parseInt(arr[1]);
        while(arrayList.size() == 0) {
            result.add(arrayList.get(cnt));
            arrayList.remove(cnt);
            cnt += Integer.parseInt(arr[1]);
            if(cnt > array)
        }

        bw.write(loc+"");
        bw.flush();
        bf.close();
    }
}