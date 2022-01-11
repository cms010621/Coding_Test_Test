public class coding_test_string_num {
    public static void main(String args[]) {
        String s = "one4seveneight";
        int answer = 0;

        String[] arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for(int i = 0;i<arr.length; i++) {
            if(s.contains(arr[i])) {
                s = s.replaceAll(arr[i], String.valueOf(i));
                System.out.println(i);
            }
        }
        answer = Integer.parseInt(s);

        System.out.println(answer);
    }
}
