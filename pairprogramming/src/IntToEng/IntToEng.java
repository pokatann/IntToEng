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
    	if (n == 0) return "zero";
    	if (String.valueOf(n).length() == 1) {
    		return digit(n);
    	}
    	int thousands = n / 1000;
    	int hundreds = (n / 100) % 10;
        int tens = (n / 10) % 10;
        int ones = n % 10;     
        
        String s = "";
        String h = "";
        if (thousands != 0) s =" thousand ";
    	if (hundreds != 0) h =" hundred ";
        if (tens == 0) {
        	if(hundreds != 0 && ones == 0) return digit(thousands) + s + digit(hundreds) +" hundred"; //100,200
        	else return digit(thousands) + s + digit(hundreds) + h + digit(ones);
        }
        
        if (tens == 1) {
    	   if (ones == 0) return digit(thousands) + s + digit(hundreds) + h + "ten"; //110
    	   if (ones == 1) return digit(thousands) + s + digit(hundreds) + h + "eleven";
    	   if (ones == 2) return digit(thousands) + s + digit(hundreds) + h + "twelve";
    	   if (ones == 3) return digit(thousands) + s + digit(hundreds) + h + "thirteen";
    	   if (ones == 5) return digit(thousands) + s + digit(hundreds) + h + "fifteen";
    	   else return digit(thousands) + s + digit(hundreds) + h + digit(ones) + "teen ";
        }
        
        if (tens == 2) {
        	if (ones==0) return digit(thousands) + s + digit(hundreds) + h + "twenty";
        	else return digit(thousands) + s + digit(hundreds) + h + "twenty " + digit(ones);   	
        }
        
        if (tens == 3) {
    	   if (ones == 0) return digit(thousands) + s + digit(hundreds) + h + "thirty";
    	   else return digit(thousands) + s + digit(hundreds) + h + "thirty " + digit(ones);
        }
        
        if (tens == 4) {
    	   if (ones == 0) return digit(thousands) + s + digit(hundreds) + h + "forty";
    	   else return digit(thousands) + s + digit(hundreds) + h + "forty " + digit(ones);
        }
        
        if (tens == 5) {
    	   if (ones == 0) return digit(thousands) + s + digit(hundreds) + h + "fifty";
    	   else return digit(thousands) + s + digit(hundreds) + h + "fifty " + digit(ones);
    	}
        
        if (tens == 8) {
     	   if (ones == 0) return digit(thousands) + s + digit(hundreds) + h + "eighty";
     	   else return digit(thousands) + s + digit(hundreds) + h + "eighty " + digit(ones);
     	}
        
        else {
    	   return digit(thousands) + s + digit(hundreds) + h + digit(tens) +"ty " + digit(ones);
        }
        
    }
    
    static String digit(int a){
    	String s = null;
    	switch (a) {
    		case 0: s = ""; break;
    		case 1: s = "one"; break;
    		case 2: s = "two"; break;
    		case 3: s = "three"; break;
    		case 4: s = "four"; break;	
    		case 5: s = "five"; break;
    		case 6: s = "six"; break;
    		case 7: s = "seven"; break;
    		case 8: s = "eight"; break;
    		case 9: s = "nine"; break;
    	}
    	return s;
    }  
    
}

