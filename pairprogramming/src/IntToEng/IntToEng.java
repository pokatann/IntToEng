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
    	if(n==0)return "zero";
    	if (String.valueOf(n).length() == 1) {
    		return hahaha(n);
    	}
    	
    	int hundreds = n / 100;
        int tens = (n / 10) % 10; // (n % 100) / 10
        int ones = n % 10;     
        
        String a="";
    	if(hundreds!=0)a=" hundred ";
        if (tens == 0) {
        	if(ones==0)return hahaha(hundreds)+" hundred";//100,200
        	return hahaha(hundreds) +a+ hahaha(ones);
        }
        
        if (tens == 1) {
    	   if (ones == 0) return hahaha(hundreds) + a+"ten";//110
    	   if (ones == 1) return hahaha(hundreds) + a+"eleven";
    	   if (ones == 2) return hahaha(hundreds) + a+"twelve";
    	   if (ones == 3) return hahaha(hundreds) + a+"thirteen";
    	   if (ones == 5) return hahaha(hundreds) + a+"fifteen";
    	   else {
    		   return hahaha(hundreds)+a+ hahaha(ones)+"teen ";
    	   }
        }
        
        if (tens == 2) {
        	if (ones==0) return hahaha(hundreds) +a+"twenty";
        	else {
        		return hahaha(hundreds) +a+"twenty "+ hahaha(ones);
        	}
        }
        if (tens == 3) {
    	   if (ones == 0) return hahaha(hundreds) +a+"thirty";
    	   else {
    		   return hahaha(hundreds) +a+"thirty "+ hahaha(ones);
    	   }
        }
        
        if (tens == 4) {
    	   if (ones == 0) return hahaha(hundreds) +a+"forty";
    	   else {
    		   return hahaha(hundreds) +a+"forty "+ hahaha(ones);
    	   }
        }
        
        if (tens == 5) {
    	   if (ones == 0) return hahaha(hundreds) +a+"fifty";
    	   else {
    		   return hahaha(hundreds) +a+"fifty "+ hahaha(ones);
    	   }
    	}
        if (tens == 8) {
     	   if (ones == 0) return hahaha(hundreds) +a+"eighty";
     	   else {
     		   return hahaha(hundreds) +a+"eighty "+ hahaha(ones);
     	   }
     	}
        
        else {
    	   return hahaha(hundreds) +a+hahaha(tens)+"ty "+ hahaha(ones);
        }
    }
    
    static String hahaha(int a){
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

