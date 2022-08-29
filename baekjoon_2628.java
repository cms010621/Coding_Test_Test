import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class baekjoon_2628 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  

        String[] str = bf.readLine().split(" ");
        int n = Integer.parseInt(bf.readLine());
        ArrayList<Integer> width = new ArrayList<>();
        ArrayList<Integer> height = new ArrayList<>();
        int area = 0;
        width.add(0);
        width.add(Integer.parseInt(str[0]));
        height.add(0);
        height.add(Integer.parseInt(str[1]));
        
        for(int i=0; i<n; i++) {
            String[] s = bf.readLine().split(" ");
            if(s[0].equals("0")) {
                height.add(Integer.parseInt(s[1]));
            } else {
                width.add(Integer.parseInt(s[1]));
            }
        }

        Collections.sort(width);
        Collections.sort(height);

        for(int i=1; i<height.size(); i++) {
            for(int j=1; j<width.size(); j++) {
                int tot = (height.get(i)-height.get(i-1))*(width.get(j)-width.get(j-1));
                if(tot > area) {
                    area = tot;
                }
            }
        }
        bw.write(area+"\n");
        bw.flush();
        bf.close();
    }
}