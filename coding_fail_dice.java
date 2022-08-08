import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class coding_fail_dice {
    public static void main(String args[]) {
        Scanner sc =  new Scanner(System.in);
        String scan = sc.nextLine();

        String []numbers = scan.split(" ");
        ArrayList<String> arr = new ArrayList<>(Arrays.asList(numbers));
        Collections.sort(arr);

        int calcNumbers = 0;
        if(arr.get(0).equals(arr.get(1)) && arr.get(1).equals(arr.get(2))) { //3개다 같을때
            calcNumbers = 10000+(Integer.parseInt(arr.get(0))*1000);
        } else if(arr.get(0).equals(arr.get(1)) || arr.get(1).equals(arr.get(2))) { //2개만
            calcNumbers = 1000+(Integer.parseInt(arr.get(1))*100);
        } else {
            calcNumbers = Integer.parseInt(arr.get(2))*100;
        }

        System.out.println(calcNumbers);
    }
}
