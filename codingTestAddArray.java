public class codingTestAddArray {
    public static void main(String[] args) {
        int[][] arr1 = {{1},{2}};
        int[][] arr2 = {{3},{4}};
        int[][] answer = arr2.clone();

        for(int j = 0; j<arr1.length; j++) {
            for(int i=0;i<arr1[0].length; i++) {
                answer[j][i] = arr1[j][i] + arr2[j][i];
            }
        }
    }
}
