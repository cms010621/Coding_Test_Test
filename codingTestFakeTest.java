public class codingTestFakeTest {
    public static void main(String[] args) {
        int[] question = {1,2,3,4,5};

        int[] firstArray = {1, 2, 3, 4, 5}; //5
        int[] secondArray = {2, 1, 2, 3, 2, 4, 2, 5}; //8
        int[] thirdArray = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}; //10
        
        int firstCount = 0;
        int secondCount = 0;
        int thirdCount = 0;

        int []arr = new int[3];

        for(int i=0;i<question.length; i++) {
            int first = firstArray[i%firstArray.length];
            int second = secondArray[i%secondArray.length];
            int third = thirdArray[i%secondArray.length];

            if(first == question[i]) arr[0] = arr[0]++;
            if(second == question[i]) arr[1] = arr[1]++;
            if(third == question[i]) arr[2] = arr[2]++;
        }

        System.out.println(firstCount);
        System.out.println(secondCount);
        System.out.println(thirdCount);
        
    }
}
