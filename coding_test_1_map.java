public class coding_test_1_map {
    public static void main(String[] args) {
        int n = 16;
        int[] arr1 = new int[n+1];
        int[] arr2 = new int[n+1];
        String[] answer = new String[n];

        for(int i = 0;i<=16; i++) {
            arr1[i] = (int) ((Math.random() * ((Math.pow(2, n)) - 0)) + 0);
            arr2[i] = (int) ((Math.random() * ((Math.pow(2, n)) - 0)) + 0);
        }

        String str1 = "";
        String str2 = "";
        String row = "";

        for(int i=0;i<n; i++) {
            row = "";
            str1 = calcFunction(arr1, n, i);
            str2 = calcFunction(arr2, n, i);
            
            for(int j = 0;j<n; j++) {
                row += str1.charAt(j) == '#' || str2.charAt(j) == '#' ? '#' : " "; 
            }
            answer[i] = row;
            System.out.println(row);
        }
    }

    public static String calcFunction(int[] arr, int n, int i) {
        String row = Integer.toBinaryString(arr[i]);
        int count = row.length();
        for(int j=0;j<n-count; j++) {
            row = '0' + row;
        }
        row = row.replaceAll("1", "#");
        row = row.replaceAll("0", " ");
        return row;
    }
}
