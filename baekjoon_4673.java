import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class baekjoon_4673 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  

        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=1; i<=10000; i++) {
            int num = i;
            String[] str = String.valueOf(num).split("");
            for(int j=0; j<str.length; j++) {
                num += Integer.parseInt(str[j]);
            }
            if(num <= 10000) {
                arr.add(num);
            }
        }

        Set<Integer> set = new HashSet<Integer>(arr);
        arr = new ArrayList<Integer>(set);
        Collections.sort(arr);

        bw.write(1 + "\n");
        for(int i = 0; i<arr.size()-1; i++) {
            for(int s = arr.get(i)+1; s < arr.get(i+1); s++) {
                bw.write(s+"\n");
            }
        }

        bw.flush();
        bf.close();
    }
}