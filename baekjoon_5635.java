import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.io.IOException; 

public class baekjoon_5635 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));   //할당된 버퍼에 값 넣어주기

        int n = Integer.parseInt(bf.readLine());
        ArrayList<String> arr = new ArrayList<>();

        for(int i=0; i<n; i++) {
            String[] str = bf.readLine().split(" ");
            String year = str[3];
            String month = (str[2].length() == 1 ? "0" : "") + str[2];
            String day = (str[1].length() == 1 ? "0" : "") + str[1];
            arr.add(year+month+day +" " + str[0]);
        }

        Collections.sort(arr);
        bw.write(arr.get(n-1).split(" ")[1]+"\n");
        bw.write(arr.get(0).split(" ")[1]+"\n");

        bw.flush();  
        bw.close();  

    }
}