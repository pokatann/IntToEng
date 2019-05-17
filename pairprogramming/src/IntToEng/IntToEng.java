package IntToEng;
import java.util.Scanner;
public class IntToEng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        System.out.println(translateEng(input));

    }

    // 数値を英訳する変換するメソッド

    static String translateEng(int n) {
    	//String s=String.valueOf(n);
    	String s =null;
    	String s2 =null;
    	int ones = n%10;
    	int tens = (n/10)%10;
    	int hundreds = n/100;
    	switch (ones) {
			case 0: s="zero"; break;
			case 1: s = "one"; break;
			case 2: s = "two"; break;
			case 3: s = "three"; break;
			case 4: s = "four"; break;
			case 5: s = "five"; break;
			case 6: s = "six"; break;
			case 7: s = "seven"; break;
			case 8: s = "eight"; break;
			case 9: s = "nine"; break;
			case 10:s="ten"; break;
		}
    
    	switch (tens) {
    		case 0: break;
    		case 2: s2 = "twenty "; break;
    		case 3: s2 = "thirty "; break;
    		case 4: s2 = "forty "; break;
    		case 5: s2 = "fifty "; break;
    		case 6: s2= "sixty "; break;
    		case 7: s2 = "seventy "; break;
    		case 8: s2 = "eighty "; break;
    		case 9: s2 = "ninety "; break;
    		}
    	
		return s2+s;
    }

}


