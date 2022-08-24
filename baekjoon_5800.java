import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.io.IOException; 

public class baekjoon_5800 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));   //할당된 버퍼에 값 넣어주기

        int num = Integer.parseInt(bf.readLine());
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=1; i<=num; i++) {
            bw.write("Class " + i+"\n");
            String[] str = bf.readLine().split(" ");
            int gap = 0;
            arr = new ArrayList<>();
            for(int j=1; j<str.length; j++) {
                arr.add(Integer.parseInt(str[j]));
            }
            Collections.sort(arr);

            for(int j=0; j<arr.size()-1; j++) {
                int large = arr.get(j+1);
                int small = arr.get(j);
                if(large - small > gap) {
                    gap = large - small;
                }
            }
            bw.write("Max " + arr.get(arr.size()-1));
            bw.write(", Min " + arr.get(0));
            bw.write(", Largest gap " + gap+"\n");
        
        }

        bw.flush();  
        bw.close();  

    }
}