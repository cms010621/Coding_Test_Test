import java.util.*;
// import java.lang.*;
// import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class euler_52
{
	public static void main (String[] args) throws java.lang.Exception
	{
        long st = System.currentTimeMillis();
        Long front = 10L;
		Long count = 10L;
		while(true) {
			if(front/count == 2) {
				count *=10;
				front = count;
			}
			String str1 = Long.toString(front);
			String str2 = Long.toString(front*2);
			String str3 = Long.toString(front*3);
			String str4 = Long.toString(front*4);
			String str5 = Long.toString(front*5);
            String str6 = Long.toString(front*6);
            
			String[] str11 = str1.split("");
			String[] str22 = str2.split("");
			String[] str33 = str3.split("");
			String[] str44 = str4.split("");
			String[] str55 = str5.split("");
            String[] str66 = str6.split("");
            
			Arrays.sort(str11);
			Arrays.sort(str22);
			Arrays.sort(str33);
			Arrays.sort(str44);
			Arrays.sort(str55);
            Arrays.sort(str66);
            
			String test1= String.join("",str11);
			String test2= String.join("",str22);
			String test3= String.join("",str33);
			String test4= String.join("",str44);
			String test5= String.join("",str55);
			String test6= String.join("",str66);
			if(test1.equals(test2)&& test2.equals(test3) && test3.equals(test4)&&test4.equals(test5)&&test5.equals(test6)){
				System.out.println(front);
			break;
                    }
                    front++;
	        }
            long end = System.currentTimeMillis();
            System.out.println("실행시간 : "+(end-st)/1000.0);
    
		}
	}