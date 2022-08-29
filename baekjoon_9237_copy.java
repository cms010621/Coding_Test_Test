import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class baekjoon_9237_copy {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  

        int n = Integer.parseInt(bf.readLine());
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> arrVal = new ArrayList<>();
        String[] str = bf.readLine().split(" ");
        int max = 0;
        for(String f : str) {
            arrVal.add(Integer.parseInt(f));
        }
        Collections.sort(arrVal, Collections.reverseOrder());

        for(int i=1; i<=n; i++) {    
            int val = i + arrVal.get(i-1);
            if(max < val) {
                max = val;
            }
        }
        bw.write(max + 1+"");

        bw.flush();
        bf.close();
    }
}