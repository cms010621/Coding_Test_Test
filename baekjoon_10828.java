import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class baekjoon_10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  

        int n = Integer.parseInt(bf.readLine());
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> resArr = new ArrayList<>();

        for(int i=0; i<n; i++) {
            String s = bf.readLine();
            if(s.contains("push")) {
                pushFunc(arr, Integer.parseInt(s.split(" ")[1]));
            } else if(s.contains("pop")) {
                popFunc(arr);
            } else if(s.contains("size")) {
                sizeFunc(arr);
            } else if(s.contains("empty")) {
                emptyFunc(arr);
            } else if(s.contains("top")) {
                topFunc(arr);
            }
        }

        bw.flush();
        bf.close();
    }

    public static ArrayList<Integer> pushFunc(ArrayList<Integer> arrayList, int num) {
        arrayList.add(num);
        return arrayList;
    }

    public static ArrayList<Integer> popFunc(ArrayList<Integer> arrayList) {
        int length = arrayList.size();
        if(length == 0) {
            System.out.println("-1");
        } else {
            System.out.println(arrayList.get(length-1));
            arrayList.remove(length-1);
        }
        return arrayList;
    }

    public static void sizeFunc(ArrayList<Integer> arrayList) {
        System.out.println(arrayList.size());
    }

    public static void emptyFunc(ArrayList<Integer> arrayList) {
        if(arrayList.size() == 0) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }

    public static void topFunc(ArrayList<Integer> arrayList) {
        if(arrayList.size() == 0) {
            System.out.println("-1");
        } else {
            System.out.println(arrayList.get(arrayList.size()-1));
        }
    }
}