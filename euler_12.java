// import java.util.*;
// import java.lang.*;
// import java.io.*;
// import java.math.*;

class euler_12
{
	public static void main (String[] args) throws java.lang.Exception
	{
	int a = 1;
	int b = 2;
	// int calNum = 2;
	int calCount = 0;
	int calTotal = 1;
	// int arr[] = new int[700];
	while(true) {
	  	a = a+b;
	  	int aplus = a;
	    for(int i=2;i<=aplus;i++) {
	      	while(true) {
	        	if(aplus%i ==0) {
		  			if(a != i) {
		    			calCount++;
		    			aplus = aplus/i;
		  			} 
		  			else {calCount = 1; break;}
				} //%
				else break;
	      	} //while
	        calTotal *= calCount;
	        calCount = 1;
	    }//for
		if(calTotal>=500) { System.out.println(a+" : "+calTotal); break;}
	    calTotal = 1;
	    b++;
	} //while
	}
}

