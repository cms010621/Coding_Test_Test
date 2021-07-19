import java.util.Arrays;

public class euler_96_0914 {
    public static void main(String[] args) {
        String sudoku[][] = {
            {"0", "0", "3", "0", "2", "0", "6", "0", "0"},
            {"9", "0", "0", "3", "0", "5", "0", "0", "1"},
            {"0", "0", "1", "8", "0", "6", "4", "0", "0"},
            {"0", "0", "8", "1", "0", "2", "9", "0", "0"},
            {"7", "0", "0", "0", "0", "0", "0", "0", "8"},
            {"0", "0", "6", "7", "0", "8", "2", "0", "0"},
            {"0", "0", "2", "6", "0", "9", "5", "0", "0"},
            {"8", "0", "0", "2", "0", "3", "0", "0", "9"},
            {"0", "0", "5", "0", "1", "0", "3", "0", "0"}
        };

        String Number[] =  {"1", "2", "3", "4", "5", "6", "7", "8", "9"};

        canIn(sudoku);//올 수 있는 숫자 정의

        for(int i=0;i<9; i++) {
            // System.out.println(Arrays.toString(sudoku[i])); 
        }

        setZero(sudoku); //모르는칸 0으로 정의하는 함수.
        canIn(sudoku);
        for(int i=0;i<9; i++) {
            System.out.println(Arrays.toString(sudoku[i])); 
        }

        onlyOne(sudoku);



        //각자 줄에서 유일하게 올 수 있는 위치를 가진 숫자를 판별하는 함수.
        //1. 세로별, 2. 가로별, 3. 칸별

        //줄에서 없는 수 찾기
        //세로
        searchNoNumber(sudoku, Number);
        //가로
        //칸별
        

        
    }

    public static String[][] canIn(String[][] sudoku) {
        String standard; //기준
        for(int w=0;w<9; w++) { //가로
            for(int h = 0; h <9; h++) { //세로
                standard = sudoku[w][h];
                if(!(standard.contains("0"))) { //0을 포함하고 있지 않을 때 = 빈 칸이 아닐 때
                    //가로
                    for(int i=0;i<9; i++) { //같은 자리가 아니고, 숫자가 있는 곳이 아니면.
                        if(i != h && sudoku[w][i].contains("0") && (!sudoku[w][i].contains(standard))) sudoku[w][i]+=standard;
                    }
                    //세로
                    for(int i=0;i<9; i++) {
                        if(i != w&& sudoku[i][h].contains("0") && (!sudoku[i][h].contains(standard))) sudoku[i][h]+=standard;
                    }
                    //칸
                    int i, j;
                    if(w<3) i=0;
                    else if(w<6) i=3;
                    else i=6;

                    if(h<3) j=0;
                    else if(h<6) j=3;
                    else j=6;

                    for(int is = i; is<i+3; is++) {
                        for(int js = j; js<j+3; js++) {
                            if(is != w && js != h && sudoku[is][js].contains("0") && (!sudoku[is][js].contains(standard))) sudoku[is][js] += standard;
                        }
                    }

                }
            }
        }

        //올수 없는 수 끝내고 올 수 있는 수로 변경. 올 수 잇는 수가 더 적다@ 와~
        for(int w = 0; w<9; w++) {
            for(int h=0;h<9; h++) {
                standard = sudoku[w][h];
                if(standard.contains("0")) { //빈칸이면 올 수 없는 수가 아닌 수를 넣는다.
                    sudoku[w][h] = "0";
                    for(int j = 1; j<10; j++) {
                        if(!standard.contains(String.valueOf(j))) sudoku[w][h]+=String.valueOf(j);
                    }

                    //그럴 일은 거의 없겠지만 0뒤에 숫자가 하나만 붙어 있는 경우에는 바로 그 수로 변경.
                    if(sudoku[w][h].length()== 2) sudoku[w][h] = ""+sudoku[w][h].charAt(1)+""; 
                }
            }
        }
        return sudoku;
    } 

    public static String[][] setZero(String[][] sudoku) {
        for(int w = 0; w<9; w++) {
            for(int h=0;h<9; h++) {
                if(sudoku[w][h].contains("0")) {
                    sudoku[w][h] = "0";
                }
            }
        }

        return sudoku;
    }

    public static String[][] onlyOne(String[][] sudoku) {
        //행 / 열에 숫자가 하나만 포함되어 있으면 그 값으로 세팅.
        return sudoku;
    }

    public static String[][] searchNoNumber(String[][] sudoku, String[] Number) {
        //세로
        int count = 0;
        for(int w=0;w<9;w++) {
            for(int h=0;h<9; h++) {
                //0을 포함하고 있으면
                if(sudoku[w][h].contains("0"));
            }
        }



        return sudoku;
    }
}
