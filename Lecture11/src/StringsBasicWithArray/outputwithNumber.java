package StringsBasicWithArray;

import java.util.Scanner;

public class outputwithNumber {

	public static void main(String[] args) {
 	Scanner s = new Scanner (System.in);
 	String str= s.nextLine();
    int a = 1;
    while(s.hasNext()) {
        str = s.nextLine();
        System.out.println(a+ " "+str);  
        a++;

 	}
 	
	}

}
