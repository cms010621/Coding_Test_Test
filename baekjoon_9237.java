import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class baekjoon_9237 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  

        int n = Integer.parseInt(bf.readLine());
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> arrVal = new ArrayList<>();
        String[] str = bf.readLine().split(" ");
        for(String f : str) {
            arrVal.add(Integer.parseInt(f));
        }
        Collections.sort(arrVal, Collections.reverseOrder());

        for(int i=0; i<n; i++) {
            int d = arrVal.get(i);
            for(int j=i; j<i+d; j++) {
                if(j > arr.size() || i == 0 || j == arr.size()) {
                    arr.add(1);
                } else {
                    arr.set(j, arr.get(j)+1);
                }
            }
        }
        bw.write(arr.size()+2+"");

        bw.flush();
        bf.close();
    }
}