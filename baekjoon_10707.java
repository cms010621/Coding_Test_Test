import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException; 

public class baekjoon_10707 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));   //할당된 버퍼에 값 넣어주기

        int a = Integer.parseInt(bf.readLine());
        int b = Integer.parseInt(bf.readLine());
        int c = Integer.parseInt(bf.readLine());
        int d = Integer.parseInt(bf.readLine());
        int p = Integer.parseInt(bf.readLine());

        int x = a*p;
        int y = 0;
        if(p < c) {
            y = b;
        } else {
            y = b + (((p-c)/1)*d) + ((p-c)%1 == 0 ? 0 : d);
        }

        bw.write((x > y ? y : x)+"\n");
        bw.flush();  
        bw.close();  

    }
}