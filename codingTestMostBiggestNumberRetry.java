import java.util.ArrayList;

public class codingTestMostBiggestNumberRetry {
    public static void main(String[] args) {
        int[] numbers = { 979, 97, 978, 81,818,817};
        ArrayList<String> arrayList = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        String answer = "";
        int maxValue = 0;
        int minIndex = 0;

        for(int i=0;i<numbers.length; i++) {
            String str = String.valueOf(numbers[i]);
            String strLast = String.valueOf(str.charAt(str.length()-1));
            int count = str.length();
            for(int j=0;j<3-count; j++) {
                str+= strLast;
            }
            arrayList.add(str);
        }

        while(true) {
            minIndex = 0;
            maxValue = 0;
            for(int i=0;i<arrayList.size(); i++) {
                if(maxValue < Integer.parseInt(arrayList.get(i))) {
                    maxValue = Integer.parseInt(arrayList.get(i));
                    minIndex = i;
                }
                //  else if(maxValue == Integer.parseInt(arrayList.get(i))) {
                //     //ex 34 / 344같은 경우
                //     minIndex = numbers[minIndex] > numbers[i] ? minIndex : i; 
                // } 있으니까 실패 더뜨는데;''
            }
            arrayList.set(minIndex, "-1");
            arr.add(minIndex);

            if(arr.size() == arrayList.size()) break;
        }

        for(int i=0;i<arr.size(); i++) {
            answer += numbers[arr.get(i)];
        }
        System.out.println(answer);
        
    }
}
