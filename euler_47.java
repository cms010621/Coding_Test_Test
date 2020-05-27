import java.util.ArrayList;
import java.util.List;

public class euler_47 {
    static List<Integer> firstArray = new ArrayList<>();
    static List<Integer> secondArray = new ArrayList<>();
    static List<Integer> thirdArray = new ArrayList<>();
    static List<Integer> fourthArray = new ArrayList<>();
    public static void main(String[] args) {
        long st = System.currentTimeMillis();

        int first = 0;
        int second = 0;
        int third = 0;
        int fourth = 0;
        for(int i=100000;i<1000000;i++) {
            firstArray = new ArrayList<>();
            secondArray = new ArrayList<>();
            thirdArray = new ArrayList<>();
            fourthArray = new ArrayList<>();

            first = i;
            second = i+1;
            third = i+2;
            fourth = i+3;

            Prime(first, firstArray, first);
            Prime(second, secondArray, second);
            Prime(third, thirdArray, third);
            Prime(fourth, fourthArray, fourth);

            if((!firstArray.containsAll(secondArray))&&(!secondArray.containsAll(thirdArray))&&(!thirdArray.containsAll(fourthArray))&&firstArray.size() == 4 && secondArray.size() == 4&&thirdArray.size() == 4&&fourthArray.size() == 4) {//포함하고 있지 않으면
                System.out.println("first : "+first);
                long end = System.currentTimeMillis();
                System.out.println("실행시간 : "+(end-st)/1000.0);
                break;
            }
        }
    }

    public static void Prime(int number, List<Integer> array, int orgin) {
        int location = -1;
        int count = 2;
        for(int i=2;i<=number;i++) {
            if(number%i==0&& i!=orgin) {
                location++;
                array.add(i);
                number = number/i;
        long st = System.currentTimeMillis();
            }
            else if(number%i==0 &&i == orgin) 
                break;
            
            while(true) {
                if(number%i==0) {
                    array.set(location, i*count++);
                    number = number/i;
                }
                else 
                    break;
            }
            
            count++;
        }
        if(array.size() == 0)
        array.add(0);
        return;

    }
}