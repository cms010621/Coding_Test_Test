import java.lang.Math;
import java.util.ArrayList;
import java.util.Arrays;

public class euler_61 {
    
    public static void main(String[] args) {
        String[][] arr = new String[6][150];
        int[] figure = new int[6];
        int fin =141;

        for(int val=1;val<fin; val++) {
            figure[0] = val*(val+1)/2;
            figure[1] = val*val;
            figure[2] = val*((val*3)-1)/2;
            figure[3] = val*((val*2)-1);
            figure[4] = val*((val*5)-3)/2;
            figure[5] = val*((val*3)-2);

            for(int i=0;i<figure.length; i++) {
                if(figure[i]<10000 && figure[i]>=1000) {
                    arr[i][val-1] = String.valueOf(figure[i]); 
                    // System.out.println(arr[i][val-1]);
                }
            }
        }

        //빈공간 제거 
        ArrayList<String> triangle = new ArrayList<>(Arrays.asList(arr[0]));
        ArrayList<String> Square = new ArrayList<>(Arrays.asList(arr[1]));
        ArrayList<String> pentagon = new ArrayList<>(Arrays.asList(arr[2]));
        ArrayList<String> hexagon = new ArrayList<>(Arrays.asList(arr[3]));
        ArrayList<String> heptagon = new ArrayList<>(Arrays.asList(arr[4]));
        ArrayList<String> octagon = new ArrayList<>(Arrays.asList(arr[5]));

        triangle.removeAll(Arrays.asList("", null));
        Square.removeAll(Arrays.asList("", null));
        pentagon.removeAll(Arrays.asList("", null));
        hexagon.removeAll(Arrays.asList("", null));
        heptagon.removeAll(Arrays.asList("", null));
        octagon.removeAll(Arrays.asList("", null));

        // System.out.println(triangle.size());
        // System.out.println(Square.size());
        // System.out.println(pentagon.size());
        // System.out.println(hexagon.size());
        // System.out.println(heptagon.size());
        // System.out.println(octagon.size());

        //뒤 두자리와 앞 두자리가 같은 숫자만 계산하니까 저렇게 무지막지하게 계산하지는 않겠지,,,
        
        // for(int tr=0; tr<triangle.size(); tr++) {
        //     for(int sq=0; sq<Square.size(); sq++) {
        //         if(triangle.get(tr).substring(2).equals(Square.get(sq).substring(0, 2))) {
        //             for(int pen=0; pen<pentagon.size(); pen++) {
        //                 if(Square.get(sq).substring(2).equals(pentagon.get(pen).substring(0, 2))) {
        //                     for(int hex=0; hex<hexagon.size(); hex++) {
        //                         if(pentagon.get(pen).substring(2).equals(hexagon.get(hex).substring(0, 2))) {
        //                             for(int hep=0; hep<heptagon.size(); hep++) {
        //                                 if(hexagon.get(hex).substring(2).equals(heptagon.get(hep).substring(0, 2))) {
        //                                     for(int oct=0; oct<octagon.size(); oct++) {
        //                                         if(heptagon.get(hep).substring(2).equals(octagon.get(oct).substring(0, 2))) {
        //                                             System.out.println("tr : "+triangle.get(tr) + " sq : "+Square.get(sq)+" pen : "+pentagon.get(pen)+" pen : "+hexagon.get(hex)+" pen : "+heptagon.get(hep)+" pen : "+octagon.get(oct));
        //                                         }
        //                                     }
        //                                 }
        //                             }
        //                         }
        //                     }
        //                 }
        //             }
        //         }
        //     }
        // }
        // System.out.println(triangle.indexOf("8128"));
        // System.out.println(Square.indexOf("8281"));
        // System.out.println(pentagon.indexOf("2882"));
        //다 있는데 왜안나와
        
        // for(int tr=0; tr<triangle.size(); tr++) {
        //     for(int sq=0; sq<Square.size(); sq++) {
        //         if(triangle.get(tr).substring(2).equals(Square.get(sq).substring(0, 2))) {
        //             // for(int pen=0; pen<pentagon.size(); pen++) {
        //                 // if(Square.get(sq).substring(2).equals(pentagon.get(pen).substring(0, 2))) {
        //                     // if(pentagon.get(pens).substring(2).equals(triangle.get(tr).substring(0, 2)))
        //                     System.out.println("tr : "+triangle.get(tr) + " sq : "+Square.get(sq));//+" pen : "+pentagon.get(pen));
        //                 // }
        //             // }
        //         }
        //     }
        // }
        
        
        // for(int tr=0; tr<triangle.size(); tr++) {
        //     for(int pen=0; pen<pentagon.size(); pen++) {
        //         if(triangle.get(tr).substring(2).equals(pentagon.get(pen).substring(0, 2))) {
        //             for(int sq=0; sq<Square.size(); sq++) {
        //                 if(Square.get(sq).substring(0, 2).equals(pentagon.get(pen).substring(2)) && Square.get(sq).substring(2).equals(triangle.get(tr).substring(0, 2))) {
        //                     System.out.println("tr : "+triangle.get(tr)+" pen : "+pentagon.get(pen) + " sq : "+Square.get(sq));
        //                 }
        //             }
        //         }
        //     }
        // }
        //서로 앞뒤2자리가 같아 연결되는 값을 6개나 찾으라니요ㅣ

        for(int a8=0;a8<octagon.size();a8++) {
            for(int a7=0;a7<heptagon.size();a7++) {
                if(octagon.get(a8).substring(2).equals(heptagon.get(a7).substring(0, 2))) {
                    for(int a6=0;a6<hexagon.size();a6++) {
                        if(heptagon.get(a7).substring(2).equals(hexagon.get(a6).substring(0, 2))) {
                            for(int a5=0;a5<pentagon.size();a5++) {
                                if(hexagon.get(a6).substring(2).equals(pentagon.get(a5).substring(0, 2))) {
                                    for(int a4=0;a4<Square.size();a4++) {
                                        if(pentagon.get(a5).substring(2).equals(Square.get(a4).substring(0, 2))) {
                                            for(int a3=0;a3<triangle.size();a3++) {
                                                if(Square.get(a4).substring(2).equals(triangle.get(a3).substring(0, 2))) {
                                                    System.out.println(" octagon : "+octagon.get(a8)  + " heptagon : "+heptagon.get(a7)  + " hexagon : "+hexagon.get(a6)  + " pen : "+pentagon.get(a5) + " sq : "+Square.get(a4)+ " tr : "+triangle.get(a3));
                                                }
                                            }
                                            
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        for(int a3=0;a3<triangle.size();a3++) {
            for(int a4=0;a4<Square.size();a4++) {
                if(triangle.get(a3).substring(2).equals(Square.get(a4).substring(0, 2))) {
                    for(int a5=0;a5<pentagon.size();a5++) {
                        if(Square.get(a4).substring(2).equals(pentagon.get(a5).substring(0, 2))) {
                            for(int a6=0;a6<hexagon.size();a6++) {
                                if(pentagon.get(a5).substring(2).equals(hexagon.get(a6).substring(0, 2))) {
                                    for(int a7=0;a7<heptagon.size();a7++) {
                                        if(hexagon.get(a6).substring(2).equals(heptagon.get(a7).substring(0, 2))) {
                                            for(int a8=0;a8<octagon.size();a8++) {
                                                if(heptagon.get(a7).substring(2).equals(octagon.get(a8).substring(0, 2))) {
                                                    System.out.println(" triangle : "+triangle.get(a3)  + " Square : "+Square.get(a4)  + " pentagon : "+pentagon.get(a5)  + " hexagon : "+hexagon.get(a6) + " heptagon : "+heptagon.get(a7)+ " tr : "+octagon.get(a8));
                                                }
                                            }
                                            
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public int chooseNum(int num) {

        return num;
    }

    public String[] search(String[] arr) {

        return arr;
    }
}
