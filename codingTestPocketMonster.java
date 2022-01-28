import java.util.ArrayList;
import java.util.HashSet;

public class codingTestPocketMonster {
    public static void main(String[] args) {
        int []nums = {3,3,3,2,2,2};
        int answer = 0;

        ArrayList<Integer> arr = new ArrayList<>();
        HashSet<String> hashSet = new HashSet<>();

        for(int i=0;i<nums.length; i++) {
            hashSet.add(String.valueOf(nums[i]));
        }

        answer = hashSet.size();
        if(answer > nums.length/2) answer = nums.length/2;

        System.out.println(answer);

    }   
}
