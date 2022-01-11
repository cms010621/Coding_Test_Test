public class coding_test_1_map {
    public static void main(String[] args) {
        int n = 10;
        int[] arr1 = {0, 20, 28, 18, 11, 2, 65, 15, 32, 1, 5};
        int[] arr2 = {30, 1, 21, 17, 28, 31, 2, 3, 34, 51} ;

        String row = "";


        String[] answer1 = new String[n];
        String[] answer2 = new String[n];
        String[] answer = new String[n];

        String row1 = "";

        for(int i=0;i<n; i++) {
            row = "";
            row1 = "";

            row = String.format("%0" + n + "d", Integer.valueOf(Integer.toBinaryString(arr1[i])));
            row = row.replaceAll("1", "#");
            row = row.replaceAll("0", " ");
            answer1[i] = row;

            
            row = String.format("%0" + n +"d", Integer.valueOf(Integer.toBinaryString(arr2[i])));
            row = row.replaceAll("1", "#");
            row = row.replaceAll("0", " ");
            answer2[i] = row;

            for(int j = 0;j<n; j++) {
                row1 += answer1[i].charAt(j) == '#' || answer2[i].charAt(j) == '#' ? '#' : " "; 
            }
            answer[i] = row1;
            System.out.println(row1);
        }


    }
}
