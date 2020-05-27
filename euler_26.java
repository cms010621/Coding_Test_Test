/* package whatever; // don't place package name! */

// import java.util.*;
// import java.lang.*;
// import java.io.*;
import java.math.*;

/* Name of the class has to be "Main" only if the class is public. */
class euler_26
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int maxnum = 0;
		int maxcount = 0;
		for(int i=2;i<=999;i++) {
			BigDecimal one = new BigDecimal("1");
			BigDecimal calc = new BigDecimal(""+i+"");
			BigDecimal plz = one.divide(calc,3000, BigDecimal.ROUND_UP);
			String test = plz.toString();
			String testStr = test.substring(2);
			// System.out.println(testStr);
			for(int j=4;j<=testStr.length()/2;j++) { //그냥 찍은거긴한데...반복으로 돌리면..될듯..while..
				
				String orgin = testStr.substring(3,j);
				String re = testStr.substring(j+3,j+j);
				if(orgin.equals(re)) {
					if(maxcount<j) {
					  maxcount = j;
					  maxnum = i;
					}
				break;
				}
			}
		}
		System.out.println("마디 : " + maxcount+" 수 : "+maxnum);
	}
}

