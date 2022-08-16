import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.io.IOException; 

public class baekjoon_10825 {
    private String name;
    private int kor;
    private int eng;
    private int math;

    public baekjoon_10825(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));   //할당된 버퍼에 값 넣어주기

        int n = Integer.parseInt(bf.readLine());

        ArrayList<String> arr = new ArrayList<>();
        ArrayList<baekjoon_10825> arrs = new ArrayList<>();

        for(int i=0; i<n; i++) {
            String[] st = bf.readLine().split(" ");
            baekjoon_10825 t = new baekjoon_10825(st[0], Integer.parseInt(st[1]), Integer.parseInt(st[2]), Integer.parseInt(st[3]));
            arrs.add(t);
        }


        Collections.sort(arr);

        bw.flush();  
        bw.close();  

    }
}