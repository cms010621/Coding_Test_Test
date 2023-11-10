import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class sy {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        String timeNum = "0";

        System.out.println("********************************************");
        System.out.println("*                                          *");
        System.out.println("*              넌센스 퀴즈~~               *");
        System.out.println("*                                          *");
        System.out.println("********************************************");

        Thread.sleep(1000);
        System.out.println("준비에 필요한 시간을 숫자로 입력하세요!");
        int cnt = 0;
        while (cnt <= 0) {
            cnt = checkNumber();
        }

        for (int i = cnt - 1; i >= 0; i--) {
            Thread.sleep(1000);
            System.out.println(i);
        }

        System.out.println("_______________게임을 시작하지_______________");
        Thread.sleep(500);
        System.out.println("Score : " + capital(0, "c:\\Minseong\\Euler\\Euler\\file.txt") + "/1961");
        System.out.println("_____________________________________________");

    } // main

    public static int checkNumber() {

        try {
            int num = Integer.parseInt(sc.nextLine().trim());
            return num;
        } catch (Exception e) {
            System.out.println("숫자가 아닌 값이 입력되었습니다. 다시 입력해주세요.");
            return 0;
        }
    } // checkNumber()

    public static int capital(int totalScore, String loc) throws Exception {
        File file = new File("C:\\Minseong\\Euler\\Euler\\file.txt");
        BufferedReader filReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "utf-8"));

        String line = "";
        List<String> list = new ArrayList();
        Boolean fin = false;

        System.out.println("pass를 입력하시면 다음 문제로 넘어가고, finish를 입력하시면 즉시 종료됩니다.");

        while ((line = filReader.readLine()) != null) {
            list.add(line);
        }
        String s = "";
        byte[] d = s.getBytes();

        for (int i = 0; i < list.size(); i++) {
            String[] ans = list.get(i).split("/");
            String rAnswer = ans[1].trim();
            String contry = ans[0];
            if (i != 0) {
                Thread.sleep(500);
            }
            System.out.println(contry + "의 수도는 어디일까요?");
            int wrongCnt = 1;

            while (true) {
                String answer = sc.nextLine().trim();
                if (answer.equals("finish")) {
                    fin = true;
                    break;
                }
                if (answer.equals("pass")) {
                    break;
                }

                if (answer.equals(rAnswer) || rAnswer.contains(answer)) {
                    System.out.println("정답입니다~~~~~~");
                    totalScore++;
                    break;
                } else {
                    if (wrongCnt % 3 == 0) {
                        System.out.println("힌트가 필요하시면 0, 필요 없으시다면 아무 키를 입력해주세요");
                        Object oAns = (Object) sc.nextLine();
                        checkCapitalHint(oAns, rAnswer);
                        switch (String.valueOf(oAns)) {
                            case "pass":
                                break;
                            case "finish":
                                fin = true;
                                break;
                            default:
                                continue;
                        }
                        if (oAns.equals(rAnswer) || rAnswer.contains(answer)) {
                            System.out.println("정답입니다~~~~~~2");
                            totalScore++;
                            break;
                        } else {
                            System.out.println("잘못된 정답입니다. 다시 시도해 주세요!");
                            wrongCnt++;
                        }
                    } else {
                        System.out.println("잘못된 정답입니다. 다시 시도해 주세요!");
                        wrongCnt++;
                    }
                }
            }
            if (fin)
                break;
        }
        return totalScore;
    }

    public static String checkCapitalHint(Object hintNum, String answer) {
        String answerCap = "ㄱㄲㄴㄷㄸㄹㅁㅂㅃㅅㅆㅇㅈㅉㅊㅋㅌㅍㅎ";

        if (hintNum.equals((Object) "0")) {
            for (int i = 0; i < answer.length(); i++) {
                if (answer.charAt(i) == ',') {
                    System.out.print(", ");
                } else {
                    char cho = String.valueOf(answer.charAt(i)).charAt(0);
                    cho = (char) ((cho - 0xAC00) / 28 / 21);
                    System.out.print(answerCap.charAt((int) cho)); // 여기서 에러
                }

            }
            System.out.println();
        }

        return answer;
    }

}
