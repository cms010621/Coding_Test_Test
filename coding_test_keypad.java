public class coding_test_keypad {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand = "right";

        int[][] keypad = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {99, 0,99}};
        int[] leftHand = {3, 0}; //start
        int[] rightHand = {3, 2};
        int[] location = {0, 0};
        int leftDist = 0;
        int rightDist = 0;
        int flag = 0;

        String answer = "";

        for(int i = 0;i<numbers.length; i++) {
            location = new int[2];
            leftDist = 0;
            rightDist = 0;
            flag = 0;
            for(int j = 0; j<4; j++) {
                for(int k = 0; k<3; k++) {
                    if(keypad[j][k] == numbers[i]) {
                        location[0] = j;
                        location[1] = k;
                        flag = 1;
                        break;
                    }
                }
                if(flag == 1) break;
            }
            if(numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) answer+= "L";
            else if(numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) answer+= "R";
            else {
                leftDist = Math.abs(leftHand[0] - location[0]) + Math.abs(leftHand[1] - location[1]);
                rightDist = Math.abs(rightHand[0] - location[0]) + Math.abs(rightHand[1] - location[1]);
    
                if(leftDist == rightDist) {
                    if(hand.equals("left")) answer += "L";
                    else answer += "R";
                }
                else if(leftDist > rightDist) answer += "R";
                else answer += "L";
            }
    
            if(answer.charAt(answer.length()-1) == 'R') {
                rightHand[0] = location[0];
                rightHand[1] = location[1];
            } else {
                leftHand[0] = location[0];
                leftHand[1] = location[1];
            }
            System.out.println("number : " + numbers[i] + " X : " + location[1] + " Y : " + location[0]);
        }

        System.out.println(answer);

    }
}
